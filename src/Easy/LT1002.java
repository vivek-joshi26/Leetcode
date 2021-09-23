//Find Common Characters
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
package Easy;

import java.util.*;

public class LT1002 {

    public List<String> commonChars(String[] words) {
        List<String> solution = new ArrayList<>();
        HashMap<Character,Integer> mapFirst = new HashMap<>();
        String first = words[0];
        for(int i = 0; i < first.length(); i++){
            char current = first.charAt(i);
            int value = mapFirst.getOrDefault(current,0);
            mapFirst.put(current, value + 1);
        }


        for( int i = 1; i < words.length; i++) {
            String current = words[i];
            HashMap<Character, Integer> tempMap = new HashMap<>();
            for (int j = 0; j < current.length(); j++) {
                char currentChar = current.charAt(j);
                int value = tempMap.getOrDefault(currentChar, 0);
                tempMap.put(currentChar, value + 1);
            }

            Set<Character> keysToRemove = new HashSet<>();
            for (Character key : mapFirst.keySet()
            ) {
                int value = tempMap.getOrDefault(key, -1);
                if (value == -1) {
                    keysToRemove.add(key);
                } else {
                    if (value < mapFirst.get(key)) {
                        //int newValue = value < mapFirst.get(key)?value:ma
                        mapFirst.put(key, value);
                    }
                }
            }
            for (Character key:keysToRemove
                 ) {
                mapFirst.remove(key);
            }
        }
        for (Character key : mapFirst.keySet()
        ) {
            int value = mapFirst.get(key);
            while (value > 0){
                solution.add(String.valueOf(key));
                value--;
            }
        }

        return solution;
    }


    // Using int array of size 26
    public List<String> commonChars2(String[] words) {
        int[] intitalMap = new int[26];
        List<String> solution = new ArrayList<>();
        for( int i = 0; i < words[0].length(); i++)
            intitalMap[words[0].charAt(i)-'a']++;

        for (int i = 1; i < words.length; i++){
            int[] tempMap = new int[26];
            for( int j = 0; j < words[i].length(); j++)
                tempMap[words[i].charAt(j) - 'a']++;
            for(int j = 0; j < intitalMap.length; j++)
                intitalMap[j] = Math.min(intitalMap[j],tempMap[j]);
        }

        for (int i = 0; i < intitalMap.length; i++){
            if(intitalMap[i] == 0)
                continue;
            String s = ((char)(i + 'a')+ "");
            for ( int j = 0; j < intitalMap[i]; j++)
                solution.add(s);
        }
        return solution;
    }

    public static void main(String[] args) {
        LT1002 lt1002 = new LT1002();
        String[] words = {"cool","lock","cook"};
        List<String> solution = lt1002.commonChars2(words);
        for (String str:solution
             ) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
