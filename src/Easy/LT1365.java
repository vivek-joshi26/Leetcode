package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class LT1365 {

    /*
        8, 1, 2, 2, 3

     */
    //bruteforce n^2
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] response = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[j] < nums[i])
                    count++;
            }
            response[i] = count;
        }
        return response;

    }

    //using map and sort nlogn, 1 2 2 3 8
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] response = new int[nums.length];
        int[] duplicate = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            duplicate[i] = nums[i];
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if(i > 0){
                if(nums[i] == nums[i - 1]){
                    map.put(nums[i],index);
                    continue;
                }
            }
            index = i;
            map.put(nums[i],index); //1,0   2,1     2,2 but should be 2,1   3,3     8,4
        }
        for(int i = 0; i < nums.length; i++){
            int num = duplicate[i];
            response[i] = map.get(num);
        }
        System.out.println(Arrays.toString(response));
        return response;
    }

    public static void main(String[] args) {
        LT1365 lt1365 = new LT1365();
        int[] arr1 = {8, 1, 2, 2, 3};
        int [] response = lt1365.smallerNumbersThanCurrent(arr1);
        for (int n: response
             ) {
            //System.out.print(n + " ");
        }
        System.out.println();
        int[] arr2 = {8, 1, 2, 2, 3};
        int [] response2 = lt1365.smallerNumbersThanCurrent2(arr1);
    }

}
