package com.practise.Testcodeapplication.DSA.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckElementSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int elementSum = array[i] + array[j];
                if (elementSum == sum) {
                    System.out.println(array[i] + " + " + array[j] + " =: " + elementSum);
//                    return;
                }
            }
        }
    }
}
