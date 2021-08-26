package SlidingWindow;

public class LongestSubArrayOf1 {

    public static int findLength(int[] array, int arraySize, int k){
        int cnt0 = 0, l = 0, length = 0;

        for( int i = 0; i < arraySize; i++){

            if( array[i] == 0)
                cnt0++;

            while (cnt0 > k){
                if( array[l] == 0)
                    cnt0--;
                l++;
            }

            length = Math.max(length, i - l + 1);
        }
        return length;
    }


    public static void main(String[] args) {

        int a[] = { 1, 0, 0, 1, 0, 1, 0, 1 };
        int k = 2;
        int n = a.length;
        System.out.println( LongestSubArrayOf1.findLength(a, n, k));

    }

}
