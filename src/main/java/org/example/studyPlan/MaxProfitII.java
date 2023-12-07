package org.example.studyPlan;

public class MaxProfitII {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];
        for(int i = 1; i < prices.length; i++) {
            int today = prices[i];
            if(today < min) min = today;
            if(today > min) profit+= today - min; min = today;
        }
        return profit;
    }
}
