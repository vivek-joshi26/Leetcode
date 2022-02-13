package Adobe.ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum3 {

    // 2 Pointer approach similar to the one used in finding the sum of 2 elements in an array
    /*
        Sort the array  -4,-1,-1,0,1,2
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        if(nums.length < 3)
            return response;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
            if(i == 0 || nums[i - 1] != nums[i])
                sum2(response,i,nums);
        }
        return response;
    }


    public void sum2(List<List<Integer>> response, int i, int[] nums){
        int low = i + 1;
        int high = nums.length - 1;
        while (low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if( sum < 0)
                low++;
            else if ( sum > 0)
                high--;
            else {
                List<Integer> current = new ArrayList<>();
                current.add(nums[i]);
                current.add(nums[low]);
                current.add(nums[high]);
                //response.add(Arrays.asList(nums[i],nums[low], nums[high]));
                response.add(current);
                current = new ArrayList<>();
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1])    // This is to avoid the repetition, because for the next element it will be called by the parent method also
                    low++;
            }

        }

    }



    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if ( nums.length < 3)
            return res;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length && nums[i] <= 0 ; i++){
            if(i == 0 || nums[i] != nums[i -1])
                add(nums,i,res);
        }
        return res;
    }

    // Now this can be implemented by both 2 pointer approach and the hashset approach also
    public void add(int[] nums, int i, List<List<Integer>> res){
        int low = i + 1;
        int high = nums.length - 1;
        while (low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if( sum < 0)
                low++;
            else if(sum > 0)
                high--;
            else {
                res.add(Arrays.asList(nums[i],nums[low++],nums[high--]));
                while (low < high && nums[low] == nums[low - 1])
                    low++;
            }
        }

    }

    // using hashset
    public void add2(int[] nums, int i, List<List<Integer>> res){

        HashSet<Integer> seen = new HashSet<>();
        for ( int j = i + 1; j < nums.length; j++){
            int complement = -nums[i] - nums[j];
            if(seen.contains(complement)){
                res.add(Arrays.asList(nums[i],nums[j],complement));
                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                    j++;
            }
            seen.add(nums[j]);
        }


    }



    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};       // after sorting-> -4,-1,-1,-1,0,1,2
        Sum3 obj = new Sum3();
        List<List<Integer>> response = obj.threeSum2(arr);

        for (List<Integer> single: response
             ) {
            System.out.print(single);
        }

        }
    }


