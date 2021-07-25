package com.hnkien;

public class Sorting {

    // Utility function to swap values at two indices in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_pos = i;
            int min_value = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min_value) {
                    min_value = arr[j];
                    min_pos = j;
                }
            }
            swap(arr, i, min_pos);
        }
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int p = quicksort_partition(arr, lo, hi);
            quickSort(arr, lo, p);
            quickSort(arr, p + 1, hi);
        }
    }

    public static int quicksort_partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi;
        int pivot = arr[hi];
        while (i <= j) {
            while ((i < hi) && (arr[i] <= pivot)) i++;
            while ((j > lo) && (arr[j] > pivot)) j--;
            swap(arr, i, j);
        }
        return j;
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cur_value = arr[i];
            int j = i - 1;
            while ((j >= 0) && (cur_value < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur_value;


        }
    }
}
