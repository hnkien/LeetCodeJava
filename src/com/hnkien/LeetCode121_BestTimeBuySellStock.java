package com.hnkien;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//121. Best Time to Buy and Sell Stock
//        You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class LeetCode121_BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_price = prices[0];
        for (int i=1; i< prices.length; i++) {
            if (min_price > prices[i]) {
                min_price = prices[i];
            }
//            max_profit = Math.max(max_profit, prices[i] - min_price);
            max_profit = (max_profit > prices[i] - min_price)? max_profit:prices[i] - min_price;
        }
        return max_profit;
    }

    public static void runTest() {
        int[] nums = {7,1,5,3,6,4};
//        int[] nums = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(nums));
    }
}
