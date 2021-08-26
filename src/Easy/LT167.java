//Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
//Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
package Easy;

import java.util.HashMap;
import java.util.Map;

public class LT167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int num = 0; num < numbers.length; num++) {
            int diff = target - numbers[num];
            if( map.containsKey(diff)){
                int first_index = map.get(diff) + 1;
                res[0] = first_index;
                res[1] = num + 1;
            }
            map.put(numbers[num],num);
        }
        for (int n : res
             ) {
            System.out.print(n+" ");
        }

        return res;
    }

    // 2 pointer approach
    public int[] twoSum1(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            if(numbers[i] + numbers[j] == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            if(numbers[i] + numbers[j] > target){
                j--;
            }
            else i++;
        }
        for (int n : res
        ) {
            System.out.print(n+" ");
        }

        return res;
    }

    public static void main(String[] args) {
        LT167 lt167 = new LT167();

        int[] nums = {2,7,11,15};
        lt167.twoSum1(nums,9);
    }
}
