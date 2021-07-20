//Factorial Trailing Zeroes
// 0 will be present if 2*5 and number of 2 multiples will be greater than 5, so just need to count the number of 5 multiples
// 5! = 1, 10! = 2, 25! = 6, 50! = 12
package Easy;

public class LT172 {

    public int trailingZeroes(int n) {

        int count = 0;
        while (n > 0){
            count+= n/5;
            n = n/5;
        }
        return count;
    }

    public static void main(String[] args) {
        LT172 obj = new LT172();
        System.out.println(obj.trailingZeroes(3));
    }



}
