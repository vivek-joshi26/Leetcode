package Adobe.ArraysStrings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if( strs.length == 0)
            return "";
        String prefix = strs[0];
        int end = 0;
        for (end = 0 ; end < prefix.length(); end++) {
            char cur = prefix.charAt(end);
            boolean breakLoop = false;
            for (int i = 1; i < strs.length; i++) {
                    if( strs[i].length() == end){
                        breakLoop = true;
                        break;
                    }
                    char sec = strs[i].charAt(end);
                    if( cur != sec){
                        breakLoop = true;
                        break;
                    }
            }
            if (breakLoop == true) break;
        }
        return prefix.substring(0,end);
    }

    public static void main(String[] args) {

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(prefix.longestCommonPrefix(strs));
    }

}
