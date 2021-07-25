package com.hnkien;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//122.Best Time to Buy and Sell Stock II
//Easy
//
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//Find the maximum profit you can achieve.You may complete as many transactions as you like
// (i.e.,buy one and sell one share of the stock multiple times).
//Note:You may not engage in multiple transactions simultaneously
// (i.e.,you must sell the stock before you buy again).

//Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 7
//        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//Example 2:
//        Input: prices = [1,2,3,4,5]
//        Output: 4
//        Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//        Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
//Example 3:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transaction is done, i.e., max profit = 0.


public class LeetCode122_BestTimeBuySellStock2 {
    public static int maxProfit2(int[] prices) {
        int max_profit = 0;

        return max_profit;
    }

//    Brute force solution:
    public static int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public static int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }

    public static void runTest() {
        int[][] nums_array = {{7,1,5,3,6,4}, {1,2,3,4,5}, {7,6,4,3,1}};
        for (int[] nums : nums_array)
//            for (int num : nums) System.out.println(num);
            System.out.println(maxProfit(nums));
    }
}
