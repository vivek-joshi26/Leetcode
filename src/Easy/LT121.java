//121. Best Time to Buy and Sell Stock
package Easy;

public class LT121 {

    // Using 2 for loops, time complexity is n^2
    public int maxProfit1(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                int temp = prices[j] - prices[i];
                if (temp > maxprofit)
                    maxprofit = temp;
            }
        }
        return maxprofit;
    }

    // Using 2 pointers and 1 loop, complexity is n= [7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            if( prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if( prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        LT121 obj = new LT121();
        int[] nums = {7,1,5,3,6,4};
        int[] nums1 = {7,6,5,4,3,2};
        System.out.println(obj.maxProfit1(nums1));
        System.out.println(obj.maxProfit(nums));

    }
}
