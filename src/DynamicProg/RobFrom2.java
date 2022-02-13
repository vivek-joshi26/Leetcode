package DynamicProg;

public class RobFrom2 {

    public int rob(int[] nums) {
        int N = nums.length;
        if(N == 0)
            return 0;
        if(N == 1)
            return nums[0];

        return Math.max(robFrom(0, N-2, nums), robFrom(1, N-1, nums));
    }

    public int robFrom(int start, int end, int[] nums){
        int robNextPlusOne = 0;
        int robNext = nums[end];

        for (int i = end - 1; i >= start; i--){
            int current = Math.max(robNext, robNextPlusOne + nums[i]);
            robNextPlusOne = robNext;
            robNext = current;
        }
        return robNext;
    }

}
