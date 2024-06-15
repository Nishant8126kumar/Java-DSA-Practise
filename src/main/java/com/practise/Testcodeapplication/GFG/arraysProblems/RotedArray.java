package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RotedArray {
    public static void main(String[] args) {
        int[] input = {8, 3, -4, 11, 4, 0};
        int rotateValue = 3;
        int size = input.length;

        for (int i = 0; i < rotateValue; i++) {
            int temp = input[0];
            int k = 1;
            while (k < size) {
                input[k - 1] = input[k];
                k++;
            }
            input[k-1]=temp;
        }
        for (int it : input) {
            System.out.print(it + " ");
        }
    }
}
