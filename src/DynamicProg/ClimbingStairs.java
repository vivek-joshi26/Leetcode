package DynamicProg;
// can climb only 1 or 2 steps at a time, find distinct ways to climb

public class ClimbingStairs {

    public int climbStairs1(int n) {
        int n1 = 1;
        int n2 = 2;
        if(n <= 2)
            return n;
        int total = 0;
        for(int i = 3; i <= n; i++){
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        return total;
    }

    // Using DP array
    public int climbStairs(int n) {
        if( n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }

}
