package com.company;

public class BuySellStockII {
    public static void main(String[] args) {
        int[] arr ={7,6,4,3,1};
        maxProfit(arr);
    }

    public static int maxProfit(int[] prices){
        int profit = 0;

        for (int i = 0; i < prices.length-1 ; i++) {
            if (prices[i+1] > prices[i]) {
                profit +=  prices[i+1] - prices[i];
            }
        }
        System.out.println(profit);
        return profit;
    }
}
