package Easy;

import java.util.HashMap;
import java.util.Map;

public class LT169 {

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int value = map.getOrDefault(temp,0);
            value++;
            if( value > nums.length/2)
                return temp;
            map.put(temp,value);
        }
        System.out.println(map);
        return -1;

        // We can do with O(1) space complexity if we use sort and then return the middle element, TC would be O(nlogn)
    }

    //Boyer-Moore Voting Algorithm
    // Can be done in linear Time without any extra space
    public int majorityElement1(int[] nums) {
            int count = 0;
            Integer candidate = null;

        for (int num: nums
             ) {
            if(count == 0){
                candidate = num;
            }
            if( candidate == num)
                count += 1;
            else count += -1;
        }
        return candidate;
    }

        public static void main(String[] args) {

        LT169 lt169 = new LT169();
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(lt169.majorityElement1(arr));
    }
}
