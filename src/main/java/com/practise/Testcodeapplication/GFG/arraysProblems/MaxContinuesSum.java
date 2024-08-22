package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MaxContinuesSum {

    static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnd = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxEnd = maxEnd + arr[i];
            if (maxSoFar < maxEnd) {
                maxSoFar = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(arr));
    }
}
