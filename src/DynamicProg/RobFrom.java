package DynamicProg;

public class RobFrom {

    // Using Memoization
    public int rob1(int[] nums) {
        int[] memo = new int[nums.length];
        for (int i = 0; i < memo.length; i++)
            memo[i] = -1;
        return robFrom(0,nums,memo);
    }

    public int robFrom(int index, int[] nums, int[] memo){
        if(index >= nums.length)
            return 0;
        if(memo[index] > -1)
            return memo[index];
        int ans = Math.max(robFrom(index + 1,nums,memo), robFrom(index + 2,nums,memo) + nums[index]);
        memo[index] = ans;
        return ans;
    }

    //using DP with tabulation
    public int rob2(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] maxRobbedAmount = new int[nums.length + 1];
        maxRobbedAmount[nums.length] = 0;
        maxRobbedAmount[nums.length - 1] = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            maxRobbedAmount[i] = Math.max(maxRobbedAmount[i+1], maxRobbedAmount[i+2] + nums[i]);
        }
        return maxRobbedAmount[0];
    }

    //Optimized DP
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        int robNextPlusOne = 0;
        int robNext = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            int current = Math.max(robNext, robNextPlusOne + nums[i]);
            robNextPlusOne = robNext;
            robNext = current;
        }
        return robNext;
    }

}
