package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShiftAllZeroInLeftInArray {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int n = arr.length;
        int zeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = 0;
                zeroIndex++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
