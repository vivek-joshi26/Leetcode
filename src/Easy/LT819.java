//819. Most Common Word
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//Output: "ball"
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LT819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        int maxCount = 0;
        String ans = "";
        for (String str:banned
             ) {
            set.add(str);
        }
        char[] charArray = paragraph.toCharArray();

        for( int i = 0; i < charArray.length; i++){
            char curCharacter = charArray[i];
            if(Character.isLetter(curCharacter)){
                word.append(Character.toLowerCase(curCharacter));
                if( i != charArray.length - 1)
                    continue;
            }
            if(word.length() > 0){
                String curWord = word.toString();
                if(! set.contains(curWord)){
                    int count = map.getOrDefault(curWord,0) + 1;
                    map.put(curWord, count);
                    if( count > maxCount) {
                        ans = curWord;
                        maxCount = count;
                    }

                }
            }
            word = new StringBuilder();
        }
        return ans;
    }

    public static void main(String[] args) {
        LT819 lt819 = new LT819();
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String response = lt819.mostCommonWord(para, banned);
        System.out.print(response);
    }

}
