package Adobe.SortingSearching;

//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
public class SearchInsertPosition {

    public int searchInsert2(int[] nums, int target) {
            int prev = nums[0];
            if (target == prev || target < prev)
                return 0;
            int result = 0;
            for (int i = 1; i < nums.length; i++){
                int cur = nums[i];
                if(cur == target || cur > target) {
                    result = i - 1;
                    break;
                }
                result = i;
            }
            return  (result +1);
    }

    // using Binary search
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, pivot;
        while (left <= right){
            pivot = (left + right) / 2;
            if(nums[pivot] == target) return pivot;
            if( target < nums[pivot]){
                right = pivot - 1;
            }
            else {
                left = pivot + 1;
            }
        }
        return left ;
    }

    public static void main(String[] args) {
        SearchInsertPosition ob1 = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.print(ob1.searchInsert(nums, 2));
    }

}
