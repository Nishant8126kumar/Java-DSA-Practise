package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class KthLargestElementInArrays {
    public static void main(String[] args) {
        int[] arrays = {7, 10, 4, 3, 20, 15};
        int k = 4;
        int size = arrays.length;
        Arrays.sort(arrays);
        int largestElementIs = arrays[k - 1];
        log.info("Largest Element is :"+largestElementIs);
    }
}
