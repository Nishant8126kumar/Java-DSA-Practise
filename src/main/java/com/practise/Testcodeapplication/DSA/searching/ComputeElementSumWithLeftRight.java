package com.practise.Testcodeapplication.DSA.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputeElementSumWithLeftRight {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int target = 10;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left] + array[right];
            if (temp == target) {
                System.out.println(array[left] + " + " + array[right] + " =:" + temp);
                return;
            } else if (temp < target) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }
    }
}
