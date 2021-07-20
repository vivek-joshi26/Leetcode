// Find first unique character in a string
//Input: s = "loveleetcode"
//Output: 2
package Easy;

import java.util.HashMap;
import java.util.Map;

public class LT387 {
    public int firstUniqChar(String s) {

        //Using character array, very costly for big strings
        /*
        char[] charArray = s.toCharArray();
        int[] countArray = new int[charArray.length];

        for (int i = 0; i < charArray.length - 1; i++){
            for (int j = i+1; j < charArray.length; j++){
                if(countArray[j] != -1) {
                    if (charArray[i] == charArray[j]) {
                        countArray[i] = -1;
                        countArray[j] = -1;
                    }
                }
            }

        }
        for (int i = 0; i < countArray.length; i++){
            if(countArray[i] != -1)
                return i;
        }

         */




        //Using ASCII values, if s contains only lowercase english characters
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            array[index]++;
        }

        for (int i =0 ; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            if(array[index] == 1)
                return i;
        }


        //using map
        /*
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int count = map.getOrDefault(c,0);
            map.put(c,count+1);
        }
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int count = map.get(c);
            if(count == 1)
                return i;
        }

         */
        return -1;

    }

    public static void main(String[] args) {
        LT387 obj = new LT387();
        System.out.println(obj.firstUniqChar("loveleetcode"));
    }


}
