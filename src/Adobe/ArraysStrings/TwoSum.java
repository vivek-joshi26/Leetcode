package Adobe.ArraysStrings;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) == true){
                answer[0] = map.get(diff);
                answer[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return answer;

    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = {2,11,7,15};
        int[] response = sum.twoSum(nums,9);
        for (int n: response
             ) {
            System.out.print(n+ " ");
        }
        System.out.println();
    }

}
