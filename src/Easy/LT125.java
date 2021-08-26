//Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
package Easy;

public class LT125 {

    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if( !isAlphaNumeric(c)){
                i++;
                continue;
            }
            if( !isAlphaNumeric(d)){
                j--;
                continue;
            }
            if( c != d)
                return false;
            i++;
            j--;

        }

        return true;

    }

    public boolean isAlphaNumeric(char c){
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static void main(String[] args) {
        LT125 lt125 = new LT125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(lt125.isPalindrome(s));
    }

}
