//Third largest number from array, if not present then return largest number
package Easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LT414 {

    // this will work only when Integer min value is not passed in nums array
    public int thirdMax(int[] nums) {

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length; i++){
            if(nums[i] > a){
                c = b;
                b = a;
                a = nums[i];
            }
            else if(nums[i] > b && nums[i] < a){
                c = b;
                b = nums[i];
            }
            else if(nums[i] > c && nums[i] < b){
                c = nums[i];
            }
        }
        if (c == Integer.MIN_VALUE)
            return a;
        return c;
    }


    // Second way
    public int thirdMax2(int[] nums) {
        // Initialise with Integer or use long
        Integer a = null;
        Integer b = null;
        Integer c = null;

        for ( Integer i: nums
             ) {
            if(i.equals(a) || i.equals(b) || i.equals(c))
                continue;
            else if( a == null || i > a){
                c = b;
                b = a;
                a = i;
            }
            else if( b == null || i > b){
                c = b;
                b = i;
            }
            else if (c == null || i > c)
                c = i;
        }
        return c == null? a:c;
    }

    //Third way by using Set
    public int thirdMax3(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i: nums
             ) {
            set.add(i);
        }
        if(set.size() < 3)
            return Collections.max(set);

        for (int i = 0; i < 2; i++){
            set.remove(Collections.max(set));
        }
        return Collections.max(set);

    }

    public static void main(String[] args) {
        LT414 obj = new LT414();
        int[] nums = {4,-7,1};
        System.out.println(obj.thirdMax3(nums));
    }


}
