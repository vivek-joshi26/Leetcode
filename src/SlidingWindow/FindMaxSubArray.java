package SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindMaxSubArray {

    // find max subarray of given windowsize,
    public int findMax(int[] nums,int arraySize, int windowSize){
        if( arraySize < windowSize)
            return -1;
        //  0  1  2  3  4   5
        //{-1, 2, 3, 1, -3, 2}
        int res = 0;

        for(int i = 0; i < windowSize; i++){
            res += nums[i];
        }

        int curSum = res;
        for( int i = windowSize; i < arraySize; i++){
            curSum += nums[i] - nums[i - windowSize];
            res = Math.max(res,curSum);
        }

        return res;
    }

    //Dynamically Sized Sliding Window: Given an array of positive integers, find the subarrays of integers that add up to a given number
    //[1, 7, 4, 3, 1, 2, 1, 5, 1] desired sum 7
    public int findIndex(int[] nums, int arraySize, int sum){
        int totalSum = nums[0],l = 0, i;
        for (i = 1; i < arraySize; i++){

            //System.out.println("Inside");
            while (totalSum > sum && l < i - 1){
                totalSum -= nums[l];
                l++;
            }

            if(totalSum == sum){
                System.out.println("Sum is present between: " + l +" and: " + (i-1));
                return 1;
            }
            if ( totalSum < sum ){
                System.out.println("Inside total sum " + totalSum );
                totalSum += nums[i];
            }

        }
        return 0;
    }

    // return list of all combinations
    public List<ArrayList<Integer>> findIndexList(int[] nums, int arraySize, int sum){
        int totalSum = nums[0],l = 0, i;
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (i = 1; i < arraySize; i++){

            //System.out.println("Inside");
            while (totalSum > sum && l < i - 1){
                totalSum -= nums[l];
                l++;
                System.out.println("Inside while:" + totalSum);
            }

            //15, 2, 4, 8, 9, 5, 10, 23
            if(totalSum == sum){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(l);
                if( i-1 != l)
                    temp.add(i-1);
                list.add(temp);
                System.out.println("Sum is present between: " + l +" and: " + (i-1));
                totalSum += nums[i];
                System.out.println("Inside total == sum " + totalSum );
                //return list;
            }
            if ( totalSum < sum ){

                totalSum += nums[i];
                System.out.println("Inside total sum " + totalSum );
            }

        }

        while (totalSum > sum && l < i - 1){
            totalSum -= nums[l];
            l++;
            System.out.println("Inside while outside:" + totalSum);
        }

        if(totalSum == sum){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(l);
            list.add(temp);
        }

        return list;
    }

    public static void main(String[] args) {

        FindMaxSubArray obj1 = new FindMaxSubArray();
        int[] nums = {-1, 2, 3, 1, -3, 2};
        int res = obj1.findMax(nums,nums.length,3);
        System.out.println(res);
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        obj1.findIndex(arr,arr.length,23);

        List<ArrayList<Integer>> result = obj1.findIndexList(arr,arr.length,23);
        System.out.println(result);

    }

}
