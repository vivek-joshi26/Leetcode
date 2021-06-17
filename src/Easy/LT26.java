//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
// such that each unique element appears only once. The relative order of the elements should be kept the same.
// a =[1,1,2,3,3,4,5]  after a = [1,2,3,4,5,1,3], return the index 4
package Easy;

public class LT26 {
    public int removeDuplicates(int[] nums) {
        int finalIndex = 0;
        for (int j = 1; j < nums.length; j++ ){
            if (nums[finalIndex] != nums[j]){
                finalIndex++;
                nums[finalIndex] = nums[j];
            }
        }
        return finalIndex;
    }

    public static void main(String[] args) {
        LT26 obj = new LT26();
        int[] nums = {1,1,2,3,3,4,5};
        int lastIndex = obj.removeDuplicates(nums);

        for (int i = 0; i <= lastIndex; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    }
