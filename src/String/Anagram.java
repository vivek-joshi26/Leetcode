//Anagram / Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. (consists of same characters in diff positions)
//abcbcabb		aabbbcbc	should return true because same and same number of 	characters are present
package String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean check(String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int count = map.getOrDefault(c, 0);
            count++;
            map.put(c, count);
        }

        System.out.println(map.toString());

        for(int i = 0; i < str2.length(); i++){
            char c = str2.charAt(i);
            int count = map.getOrDefault(c, -1);
            count--;
            if(count < 0) {
                System.out.println(map.toString());
                return false;
            }
            map.put(c,count);
        }

        System.out.println(map.toString());
        return true;

    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        /*
        Map<Character,Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 1);
        map.put('a', 2);
        System.out.println(map.toString());
         */

        System.out.println(anagram.check("abcbcabb", "aabbbcbc"));
    }
}
