//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
package Easy;

public class LT122 {
// by maintaining different valleys and peaks
    public int maxProfit(int[] prices) {
        int index = 0;
        int valley = prices[0];
        int peak = prices[0];
        int max_profit = 0;

        while (index < prices.length -1){
            while (index < prices.length - 1 && prices[index] > prices[index + 1])
                index++;
            valley = prices[index];
            while (index < prices.length - 1 && prices[index + 1] > prices[index])
                index++;
            peak = prices[index];
            max_profit += peak - valley;
        }
        return max_profit;
    }

    // approach 2 by adding consecutively
    public int maxProfit1(int[] prices) {
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1])
                max_profit += prices[i] - prices[i-1];
        }
        return max_profit;
    }

    public static void main(String[] args) {
        LT122 obj = new LT122();
        int[] nums = {7,1,5,3,6,4};
        int[] nums1 = {7,6,5,4,3,2};
        //System.out.println(obj.maxProfit1(nums1));
        System.out.println(obj.maxProfit1(nums));
    }
}
