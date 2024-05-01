package com.practise.Testcodeapplication.DSA.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckDuplicateElementInArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        //Check duplicate Element with one loop element should be in sorted order.
        for (int i = 0; i < n - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Duplicate Element is :" + array[i]);
                return;
            }

        }
    }
}
