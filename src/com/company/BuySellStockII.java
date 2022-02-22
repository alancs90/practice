package com.company;

public class BuySellStockII {
    public static void main(String[] args) {
        int[] arr ={3,3,5,7,9};
        maxProfit(arr);
    }

    public static int maxProfit(int[] prices){
        int profit = 0;

        for (int i = 0; i < prices.length-1; i++){
            if (prices[i+1] > prices[i]){
                profit = profit + prices[i+1] - prices[i];
            }
        }
//        for (int i = 0; i < prices.length-1 ; i++) {
//            if (prices[i+1] > prices[i]) {
//                profit +=  prices[i+1] - prices[i];
//            }
//        }
        System.out.println(profit);
        
        return profit;
    }
}
