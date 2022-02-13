package Adobe.ArraysStrings;

public class RomanToInteger {
    // special cases
    /*
        IV 4    IX 9
        XL 40   XC 90
        CD 400  CM 900
        I 1, X 10, L 50, C 100, D 500, M 1000
     */

    public int romanToInt(String s) {
        int num = 0;
        for( int i = 0; i < s.length();i++ ){
            char cur = s.charAt(i);
            if(cur == 'C'){
                if( i != s.length() - 1){
                    char next = s.charAt(i + 1);
                    if(next == 'M') {
                        num += 900;
                        i++;
                    }
                    else if(next == 'D'){
                        num += 400;
                        i++;
                    }
                    else num += 100;
                }
                else num += 100;
            }
            else if(cur == 'X'){
                if( i != s.length() - 1){
                    char next = s.charAt(i + 1);

                    if(next == 'C'){
                        num += 90;
                        i++;
                    }
                    else if(next == 'L') {
                        num += 40;
                        i++;
                    }
                    else num += 10;
                }
                else num += 10;
            }
            else if(cur == 'I'){
                if( i != s.length() - 1){
                    char next = s.charAt(i + 1);
                    if(next == 'V') {
                        num += 4;
                        i++;
                    }
                    else if(next == 'X') {
                        num += 9;
                        i++;
                    }
                    else num += 1;
                }
                else num += 1;
            }
            else {
                if(cur == 'V') num += 5;
                else if(cur == 'L') num += 50;
                else if(cur == 'D') num += 500;
                else if (cur == 'M') num += 1000;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();
        System.out.println(roman.romanToInt("MDCCCLXXXIV"));
    }


}
