//Write a function that reverses a string. The input string is given as an array of characters s.
package Easy;

import java.util.Arrays;

public class LT344 {

    public void reverseString(char[] s) {
        char[] response = new char[s.length];
        int j = s.length - 1;
        for(int i = 0; i < s.length; i++){
            response[i] = s[j];
            j--;
        }
        System.out.println(Arrays.toString(response));
    }

    //without using extra array
    public void reverseString2(char[] s) {
        /*
        int j = 0;
        for( int i = s.length-1; i >= s.length/2; i--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
        }

         */
        // using while loop
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }


        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        LT344 lt344 = new LT344();
        char[] arr = {'h','e','l','l','o'};
        lt344.reverseString2(arr);

    }

}
