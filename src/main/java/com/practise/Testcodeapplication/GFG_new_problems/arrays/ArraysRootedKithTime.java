package com.practise.Testcodeapplication.GFG_new_problems.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArraysRootedKithTime {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 2, 4};
        int n = arr.length;
        int k = 2;

        for (int i = 0; i < k; i++) {
            int temp = arr[n-1];
            for (int j = n-1; j >0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }


        for (int i : arr) {
            System.out.print(" " + i);
        }

    }
}
