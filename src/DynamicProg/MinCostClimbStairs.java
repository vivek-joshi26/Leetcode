package DynamicProg;

public class MinCostClimbStairs {

    // bottom up DP, maintain the sum of minimum costs starting from 0, for 0 & 1 we can start from their so minCost is 0 so for example--
    // if we are checking for step 3 then we can reach their either 1 step back or 2 step back
    // so for 2 it will be MINIMUM of= minCost(0) + cost(0) or minCost(1) + cost(1) , so the minCost for both will be 0 but cost for both will be some value, and minimum
    // will be updated for step 2, similarly for step 3, we will check minCost(1) + cost(1) or minCost(2) + cost(2)
    // minCost of 1 is 0 but cost would be some value, and minCost(2) we updated in above step so it will compare both and update minsteps for 3
    public int minCostClimbingStairs1(int[] cost) {
        int[] minCost = new int[cost.length + 1];

        for (int i = 2; i < minCost.length; i++){
            minCost[i] = Math.min((minCost[i - 1] + cost[i - 1]), (minCost[i - 2] + cost[i - 2]));
        }
        return minCost[minCost.length - 1];

    }


    // also can be done similar to the fibonacci problem
    public int minCostClimbingStairs(int[] cost) {
        int downOne = 0;
        int downTwo = 0;

        for (int i = 2; i <= cost.length; i++){
            int temp = downOne;
            downOne = Math.min((downOne + cost[i-1]), (downTwo + cost[i - 2]));
            downTwo = temp;
        }
        return downOne;
    }

    public static void main(String[] args) {

    }
}
