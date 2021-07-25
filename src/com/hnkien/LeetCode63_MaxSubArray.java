package com.hnkien;

//  https://leetcode.com/problems/maximum-subarray/
//  Given an integer array nums, find the contiguous subarray (containing at least one number)
//        which has the largest sum and return its sum.
//        A subarray is a contiguous part of an array.
//        Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

public class LeetCode63_MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int max_ending_here = max;
        for (int i=1; i<n; i++) {
            max_ending_here = Math.max(max_ending_here+nums[i], nums[i]);
            max = Math.max(max, max_ending_here);
        }
        return max;
    }
    public static void runTest() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
