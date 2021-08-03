package com.hnkien;

//https://leetcode.com/problems/sort-colors/
// 75. Sort Colors
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//Input: nums = [2,0,1]
//Output: [0,1,2]
//Example 3:
//Input: nums = [0]
//Output: [0]
//Example 4:
//Input: nums = [1]
//Output: [1]

public class LeetCode75_DutchFlagSort {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int next_index_0 = 0, next_index_2 = n-1, i=0, tmp;
        while ( (i <= next_index_2) && (next_index_0 <= next_index_2) ) {
//            System.out.println(next_index_0 + " " + i + " " + next_index_2);
            if (nums[i] == 0)  {
                tmp = nums[next_index_0];
                nums[next_index_0] = 0;
                nums[i] = tmp;
                next_index_0++;
                i++;
            }
            else if (nums[i] == 2) {
                tmp = nums[next_index_2];
                nums[next_index_2] = 2;
                nums[i] = tmp;
                next_index_2--;
            }
            else i++;
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void printColors(int[] nums) {
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void runTest() {
        int[] nums = {2,0,2,1,1,0};
//        int[] nums = {1,2,0};
        printColors(nums);
        sortColors(nums);
        printColors(nums);
    }
}
