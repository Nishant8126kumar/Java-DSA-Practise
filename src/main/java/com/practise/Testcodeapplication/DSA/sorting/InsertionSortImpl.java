package com.practise.Testcodeapplication.DSA.sorting;

public class InsertionSortImpl {
    public static void sort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;


        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr, arr.length);
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }
}
