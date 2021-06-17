//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target

package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LT1 {

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                solution[0] = map.get(temp);
                solution[1] = i;
                return solution;
            }
            map.put(nums[i],i);
        }
        return solution;
    }



    // Return true if a combination of numbers is present, whose sum = target
    public boolean twoSumVar2(int[] nums,int target){
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(integerSet.contains(temp))
                return true;
            integerSet.add(nums[i]);
        }
        return false;
    }

    // return the index of the array of those 2 elements
    public void twoSumVar3(int[] nums,int target){
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(integerHashMap.containsKey(temp)){
                int index2 = integerHashMap.get(temp);
                int index1 = i;
                System.out.println(index2+" "+ index1);
                int[] solution = new int[2];
                solution[0] = index2;
                solution[1] = index1;
                System.out.println(solution);
            }
            integerHashMap.put(nums[i],i);
        }

    }

    public static void main(String[] args) {
        int[] array ={3, 2, 5, 7};
        LT1 obj = new LT1();
        System.out.println(obj.twoSumVar2(array,7));
        obj.twoSumVar3(array,17);
    }
}
