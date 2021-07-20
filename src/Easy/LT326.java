//Power of Three
// 27 true, 9 true, 45 false, 10 false
//An integer n is a power of three, if there exists an integer x such that n == 3^x

package Easy;

public class LT326 {

    public boolean isPowerOfThree(int n) {
        if ( n < 1)
            return false;
        while (n % 3 == 0){
            n = n / 3;
        }

        return n == 1;
    }



    public static void main(String[] args) {
        LT326 obj = new LT326();
        System.out.println(obj.isPowerOfThree(1));
    }
}


