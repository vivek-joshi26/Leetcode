package Adobe.ArraysStrings;
/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */


import java.util.Arrays;



public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && diff != 0; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(sum - target) < Math.abs(diff)) {
                    diff = target - sum;
                    if(diff == 0)
                        break;
                }
                if(sum > target)
                    high--;
                if(sum <target)
                    low++;
            }
        }
        return target - diff;   // we have to return the sum not the diff
    }

    public static void main(String[] args) {
        Sum3Closest obj = new Sum3Closest();
        int[] arr = {0,1,2};
        System.out.print(obj.threeSumClosest(arr,3));
    }




}
