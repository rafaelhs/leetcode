package org.example.studyPlan;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0], profitToday = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            profitToday = prices[i] - min;
            if (profitToday > profit) profit = profitToday;
        }
        return profit;
    }
}
