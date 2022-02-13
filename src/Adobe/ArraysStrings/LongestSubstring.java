package Adobe.ArraysStrings;
//Given a string s, find the length of the longest substring without repeating characters.
//Input: s = "pwwkew"
// dvdf
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashMap;
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int res = 0;
        int i = -1;
        int j = -1;

        while (true) {
            boolean f1 = false, f2 = false;
            //acquire till there is no repeat
            while (i < s.length() - 1){
                f1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if( map.get(ch) > 1){
                    break;
                }else {
                    int len = i - j;
                    if(len > res)
                        res = len;
                }
            }

            //release till the count is not greater than 1
            while (j < i){
                j++;
                f2 = true;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if( map.get(ch) == 1)
                    break;
            }

            if(f1 == false && f2 == false)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        LongestSubstring substring = new LongestSubstring();
        System.out.println(substring.lengthOfLongestSubstring("pwwkew"));
    }

}
