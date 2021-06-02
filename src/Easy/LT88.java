package Easy;

public class LT88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n > 0){
            if(nums1[m-1] < nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
            else{
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
        }
        while(n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }

    public static void main(String[] args) {
        LT88 obj1 = new LT88();
        int[] nums1 = new int[]{1,3,4,0,0,0,0};
        int[] nums2 = new int[]{2,5,7,8};
        obj1.merge(nums1,3,nums2,4);
        for (int n :nums1
             ) {
            System.out.println(n);

        }
    }
}
