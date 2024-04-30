package com.practise.Testcodeapplication.sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSortImpl {

    public static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int[] mergedArray = new int[endIndex - startIndex + 1];
        int idx1 = startIndex;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIndex) {
            if (arr[idx1] < arr[idx2]) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }
        while (idx2 <= endIndex) {
            mergedArray[x++] = arr[idx2++];
        }
        for (int i = 0, j = startIndex; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }

    }

    public static void divide(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;

        divide(arr, startIndex, mid); //left
        divide(arr, mid + 1, endIndex); //right

        conquer(arr, startIndex, mid, endIndex);



    }

    public static void main(String[] args) {
        int[] arr = {4,3,2};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }
}
