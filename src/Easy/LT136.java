//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: nums = [4,1,2,1,2]
//Output: 4

package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LT136 {

    // brute force, Space complexity O(1), time is O(n^2)
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length - 1 ; i++){
            boolean flag = false;
            if( nums[i] == -100000)
                continue;
            for ( int j = i+1; j < nums.length; j++){
                if( nums[i] == nums[j]){
                    nums[j] = -100000;
                    flag = true;
                    break;
                }
            }
            if( flag == false){
                num = nums[i];
                return num;
            }

        }

        return nums[nums.length -1];

    }


    // doing in linear time, Space complexity O(n), time is O(n)
    public int singleNumber2(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (int i = 0; i < nums.length ; i++){
            if(map.get(nums[i]) == 1)
                return nums[i];
        }
        return 0;
    }

    // doing in linear time, experimenting with the map
    public int singleNumber3(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int value = map.getOrDefault(nums[i],0);
            if( value == 1){
                map.remove(nums[i],value);
            }
            else
                map.put(nums[i],value + 1);
        }
        int num = -1;
        for (int i: map.keySet()
             ) {
            num = i;
        }
        return num;
    }

    // using arraylist, Space complexity O(n), time is O(n^2), because the contains method of arrayList will also add up
    public int singleNumber4(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i : nums){
            if( arrayList.contains(i) != true){
                arrayList.add(i);
            }
            else arrayList.remove(Integer.valueOf(i));
        }

        return arrayList.get(0);

    }



    public static void main(String[] args) {
        LT136 lt136 = new LT136();
        int[] nums = {4,1,2,1,2};
        //System.out.println(lt136.singleNumber(nums));
        System.out.println(lt136.singleNumber2(nums));
        System.out.println(lt136.singleNumber4(nums));
    }

}
