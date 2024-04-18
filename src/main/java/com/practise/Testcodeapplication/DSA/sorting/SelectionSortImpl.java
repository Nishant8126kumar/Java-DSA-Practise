package com.practise.Testcodeapplication.DSA.sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSortImpl {
    public static void sort(int[] arr, int n) {

        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
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
