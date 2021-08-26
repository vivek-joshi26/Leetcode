package Easy;

public class LT168 {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        // Second way
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        // ****
        while (columnNumber > 0){
            if(columnNumber % 26 == 0) {
                sb.insert(0, "Z");
                columnNumber--;
            }
            else {
                //sb.insert(0,(char) (columnNumber%26 + 64));   // becase ASCII value of A starts from 65
                sb.insert(0,arr[columnNumber%26 -1]);
            }

            columnNumber = columnNumber / 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LT168 lt168 = new LT168();
        String res = lt168.convertToTitle(701);
        System.out.println(res);
    }

}
