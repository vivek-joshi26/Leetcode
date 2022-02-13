package Easy;

public class LT392 {

    public boolean isSubsequence(String s, String t) {
        int first = s.length();
        int second = t.length();
        int i = 0, j = 0;

        if( first > second)
            return false;
        if( first == 0)
            return true;
        while (i < first && j < second){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        if(i == first)
            return true;
        return false;
    }

    public static void main(String[] args) {
        LT392 lt392 = new LT392();
        System.out.println(lt392.isSubsequence("abc", "avbec"));
    }

}
