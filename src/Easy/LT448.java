//448. Find All Numbers Disappeared in an Array
//Input: nums = [4,3,2,7,8,2,3,1]        // 1,2,2,3,3,4,7,8
//Output: [5,6]
package Easy;

import java.util.*;

public class LT448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> response = new ArrayList<>();
        Set<Integer> uniqueset = new HashSet<>();

        for (int num: nums
             ) {
            uniqueset.add(num);
        }
        for(int i = 1; i <= nums.length; i++){
            if(uniqueset.contains(i))
                continue;
            response.add(i);
        }
        return response;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> response = new ArrayList<>();
        int[] secArray = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++)
            secArray[nums[i]] += 1;
        //{4,3,2,7,8,2,3,1}
        //0,0,0,0,0,0,0,0,0         0,1,2,2,1,0,0,1,1
        for(int i = 0; i < secArray.length; i++){
            if(i != 0 && secArray[i] == 0)
                response.add(i);

        }
        return response;
    }

    //{4,3,2,7,8,2,3,1}



    public static void main(String[] args) {
        LT448 lt448 = new LT448();
        int[] nums ={4,3,2,7,8,2,3,1};
        List<Integer> response = lt448.findDisappearedNumbers2(nums);
        for (int num:response
             ) {
            System.out.print(num);
        }
    }

}

/*
[4,3,2,7,8,2,3,1]
4       replace with 7  - 7,3,2,4,8,2,3,1
7       replace with

 */
