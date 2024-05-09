package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShiftNegativeNumberLeft {
    public static void main(String[] args) {

        int[] arr = {3, 6, 4, -2, -9, -1, 4, 30, -90,-12};
        int n = arr.length;
        int zeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp=arr[i];
                arr[i]=arr[zeroIndex];
                arr[zeroIndex]=temp;
                zeroIndex++;

            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
