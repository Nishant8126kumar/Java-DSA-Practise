package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeftShiftNegative {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, -2, -9, -1, 4, 30, -90, -12};
        int size = arr.length;
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;


            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
