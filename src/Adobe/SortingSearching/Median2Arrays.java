package Adobe.SortingSearching;

public class Median2Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        if( m == 0 ){
            if ( n % 2 == 0){
                result = (nums2[ (n/2) -1] + nums2[n/2]) / 2.0;
                return result;
            }
            else {
                return nums2[n / 2];
            }
        }
        if( n == 0 ){
            if ( m % 2 == 0){
                result = (nums1[ (m/2) -1] + nums1[m/2]) / 2.0;
                return result;
            }
            else {
                return nums1[m / 2];
            }
        }
        // First we need to merge the sorted arrays
        int[] merge = new int[m + n];
        merge(nums1,nums2,merge);
        int total = m + n;
        if( total % 2 == 0){
            result = (merge[( total/2 ) -1] + merge[( total/2 )]) / 2.0;

        }
        else {
            result = merge[(total / 2)];
        }
        return result;

    }

    public void merge(int[] nums1, int[] nums2, int[] merge){

        int n1 = 0, n2 = 0, m1 = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] < nums2[n2]) {
                merge[m1] = nums1[n1];
                m1++;
                n1++;
            } else {
                merge[m1] = nums2[n2];
                m1++;
                n2++;
            }
        }

        while (n1 < nums1.length){
            merge[m1] = nums1[n1];
            m1++;
            n1++;
        }

        while (n2 < nums2.length){
            merge[m1] = nums2[n2];
            m1++;
            n2++;
        }


    }


            /*
        int total = m + n;
        if( total % 2 == 0){
            int c2 = total / 2;
            int c1 = c2 - 1;
            int t1 = 0, t2 = 0;
            if (c1 < m) {
                t1 = nums1[c1];
                if (c2 < m) {
                    t2 = nums1[c2];
                }
                else {
                    t2 = nums2[0];
                }
                result = (t1 + t2) /2;
                return result;
            }
            else {
                t1 = nums2[c1 - m];
                t2 = nums2[c2 - m];
                result = (t1 + t2)/2;
            }
        }
        else {
            int index = total / 2;
            if( index < m){
                result = nums1[index];
            }
            else {
                int counter = index - m ;
                result = nums2[counter];
            }
        }

        return result;

         */


}
