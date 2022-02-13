//Best Time to Buy and Sell Stock II
package TopInterview.Array;

public class BuyAndSell {

    public int maxProfit(int[] prices) {

        if(prices.length == 0 || prices.length == 1)
            return 0;

        int profit = 0, i = 0, valley = prices[0], peak = prices[0];
        while (i < prices.length - 1){
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] <= prices[i + 1]){
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }



}
