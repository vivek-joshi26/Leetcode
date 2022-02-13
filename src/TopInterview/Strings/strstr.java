package TopInterview.Strings;
// hello  and ll


public class strstr {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 || needle.length() == 0)
            return 0;

        if(haystack.length() < needle.length())
            return -1;

        int j = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                int k = i + 1;
                for(j = 1; j < needle.length(); j++){

                }
            }
        }

    }

}
