package Easy;

import java.util.Arrays;

public class LT1480 {

    public int[] runningSum(int[] nums) {
        int count = 0;
        int[] response = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            count += nums[i];
            response[i] = count;
        }
        return response;
    }

    public int[] runningSum2(int[] nums) {
        int count = 0;
        //int[] response = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            count += nums[i];
            nums[i] = count;
        }
        return nums;
    }

    public static void main(String[] args) {
        LT1480 lt1480 = new LT1480();
        int[] arr1 = {1,2,3,4};
        int[] response = lt1480.runningSum2(arr1);
        System.out.println(Arrays.toString(response));
    }

}
