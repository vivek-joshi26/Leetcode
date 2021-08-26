//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array.
package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LT268 {

    // runtine logn, space complexity is O(1)
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if( nums[0] != 0 )
            return 0;
        for (int i = 1; i < nums.length ; i++){
            if(i != nums[i])
                return i;
        }
        return nums.length;
    }


    // runtime o(n) space o(n)
    public int missingNumber_1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++){
            if(! set.contains(i))
                return i;
        }
        return nums.length;
    }

    // Using Gause formula, time: O(n), space O(1)
    // actually the input should be like 0,1,2,3,4,5 so the total sum can be n(n+1)/2, -> 5*6/2
    // but in reality if suppose 4 is missing, 0,1,2,3,5 -> 11, 5*6/2
    public int missingNumber_2(int[] nums) {
        int expected_sum = (nums.length*(nums.length + 1))/2;
        int actual_sum = 0;
        for (int n: nums
             ) {
            actual_sum += n;
        }
        return expected_sum - actual_sum;
    }



    public static void main(String[] args) {
        LT268 lt268 = new LT268();
        int[] nums = {0,1,4,7,6,3,2};
        //int[] nums = {3,0,1};
        //int[] nums = {0,1};
        System.out.println(lt268.missingNumber_2(nums));

    }


}
