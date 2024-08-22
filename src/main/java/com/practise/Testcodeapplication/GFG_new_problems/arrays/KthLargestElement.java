package com.practise.Testcodeapplication.GFG_new_problems.arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        Arrays.sort(arr);
        log.info("Arrays :" + Arrays.toString(arr));
        log.info("3 largest element :" + arr[k - 1]);
    }
}