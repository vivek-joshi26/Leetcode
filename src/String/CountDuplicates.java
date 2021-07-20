//If a string "aaabbccccddaaeeeee" is given to a function, print "a3b2c4d2a2e5"
package String;

public class CountDuplicates {

    public static void countDuplicate(String str) {
        if (str.length() == 0)
            System.out.println();
        else {
            String str2 = "";
            char c1 = str.charAt(0);
            int count = 1;
            for (int i = 1; i < str.length(); i++) {
                char c2 = str.charAt(i);
                if (c1 == c2) {
                    count++;
                } else {
                    str2 = str2 + c1 + count;
                    c1 = c2;
                    count = 1;
                }
            }
            if (count > 0)
                str2 = str2 + c1 + count;
            System.out.println(str2);
        }
    }

    public static void main(String[] args) {
        countDuplicate("abbccccddaaeeee");
    }
}
