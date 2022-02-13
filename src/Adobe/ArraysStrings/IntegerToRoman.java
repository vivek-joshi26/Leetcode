package Adobe.ArraysStrings;
/*
Approach 1- Greedy Approach
-- Find the closest smallest value and subtract that from the number, append it to the string and then continue the loop till we have num value remaining.

Approach 2-
-- Maintain 4 array for all possible values, 1-  , M,MM,MMM 2-  , C, CC ,CCC, CD, D ,.....etc
-- Find the digit at 1000th place and get the corresponding value from array num/1000 + hundreds[num %1000 /100]


 */

public class IntegerToRoman {

    //Approach 1
    public String intToRoman(int num) {
        String[] list = {"M","CM", "D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < value.length; i++) {

            while(value[i] <= num) {
                stringBuilder.append(list[i]);
                num -= value[i];
            }
        }

        return stringBuilder.toString();
    }


    //Approach 2
    public String intToRoman2(int num) {
            String[] thousands = {"", "M", "MM", "MMM"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD","D" ,"DC","DCC","DCCC","CM"};
            String[] tens = {"", "X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX","XC"};
            String[] ones = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};

            return thousands[num/1000] + hundreds[(num % 1000)/100] + tens[(num % 100)/10] + ones[(num % 10)] ;
    }

    public static void main(String[] args) {
        IntegerToRoman integer = new IntegerToRoman();
        System.out.println(integer.intToRoman2(1994));
    }

}
