package com.practise.Testcodeapplication.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }

    public static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<min)
                {
                    min=arr[j];
                    temp=arr[j];
                    arr[min]=temp;
                }
            }
        }

    }
}
