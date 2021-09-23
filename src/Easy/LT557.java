//Reverse Words in a String III
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
package Easy;

import java.util.Arrays;

public class LT557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
       String[] arr = s.split(" ");
       for (int i = 0; i < arr.length; i++){
           char[] res = reverseSingleWord(arr[i]);
           sb.append(res);
           sb.append(" ");
       }
       String stringRes = sb.toString();
       return stringRes.trim();
    }

    public char[] reverseSingleWord(String s){
        char[] arr = s.toCharArray();
        int n = arr.length  - 1;
        for(int i = 0; i < arr.length/2; i++){
            char temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            n--;
        }
        return arr;

    }

    // second way
    public String reverseWords2(String s) {
        String rev = "";
        int begin = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                String subStr = s.substring(begin,i);
                begin = i + 1;
                String res = reverse(subStr);
                rev += res + " ";
            }
        }
        String substr = s.substring(begin,s.length());
        String res = reverse(substr);
        rev += res;
        return rev.trim();

    }

    public String reverse(String str){
        String s1 = "";
        for (int i = str.length()-1; i >=0; i--){
            s1 = s1 + str.charAt(i);
        }
        return s1;
    }


    public static void main(String[] args) {
        LT557 lt557 = new LT557();
        String  s = "Let's take LeetCode contest";
        String res = lt557.reverseWords2(s);
        System.out.println(res);
    }

}
