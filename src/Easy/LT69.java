//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
// Using Binary search method, we start by using low = 0, high = n and mid = (high+low)/2, this is basically used to get an element in a sorted array and here low high mid are indexes

package Easy;
public class LT69 {

    public int mySqrt(int x) {

        int low = 0, mid, high = x/2;

        while (low <= high) {
            mid = (low + high) / 2;

            if (mid == x/mid) {
                return mid;
            }
            else if (mid > x/mid){
                    high = mid - 1;
            }
            else if(mid < x/mid){
                low = mid +1;
            }

        }
        return high;
    }

    public static void main(String[] args) {
        LT69 newObj = new LT69();
        System.out.println(newObj.mySqrt(2147395600));
    }

}
