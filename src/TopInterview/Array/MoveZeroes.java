package TopInterview.Array;

public class MoveZeroes {

    // 2 3 0 4 0 5
    // 0 0 2 0 1

    public void moveZeroes(int[] nums) {

        if(nums.length == 1)
            return;
        int i = 0,j = i + 1;
        while (i < nums.length && j < nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else if(nums[i] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
    }

}
