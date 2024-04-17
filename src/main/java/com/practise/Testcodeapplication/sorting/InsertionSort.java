package com.practise.Testcodeapplication.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 100};
        sort(arr);
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j=i-1;
            while (j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
}
