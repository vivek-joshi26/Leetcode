package String;

public class ReverseString {
    /*
    Input= "A for apple B for ball"
    Output= "llab rof B elppa rof A"
     */
    public static void simpleReverse(String str){
        String s1 = "";
        for (int i = str.length() - 1; i >= 0; i-- ){
            s1 = s1 + str.charAt(i);
        }
        System.out.println(s1);
    }


    public static String simpleReverse2(String str){
        String s1 = "";
        for (int i = str.length() - 1; i >= 0; i-- ){
            s1 = s1 + str.charAt(i);
        }
        return s1;
    }

    /*
    Input= "A for apple B for ball"
    Output= "A rof elppa B rof llab"
     */
    public static void simpleReverseAtPlace(String str){
        String s1 = str.concat(" ");
        String rev = "";
        int begin = 0, end = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                String temp = "";
                end = i;
                temp = str.substring(begin,end);
                rev = rev + simpleReverse2(temp)+" ";
                begin = i+1;
            }
        }
        System.out.println(rev.trim());
    }

    /*
    Input= "A for apple B for ball"
    Output= "ball for B apple for A"
     */

    public static void inOrderReverse(String str){
        String s1 = "";
        s1 = simpleReverse2(str)+" ";
        System.out.println(s1);
        String reverse = "";
        int begin = 0, end = 0;
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)==' '){
                end = i;
                String temp = s1.substring(begin,end);
                reverse = reverse + simpleReverse2(temp) + " ";
                begin = i+1;
            }
        }
        System.out.println(reverse.trim());
    }

    public static void main(String[] args) {
        String str = "A for apple B for ball";
        System.out.println(str);
        simpleReverse(str);
        simpleReverseAtPlace(str);
        inOrderReverse(str);
    }
}
