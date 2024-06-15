package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class KadaneFindMaxContinuesSum {
    static int maxSubArraySum(int a[]) {
        Set<Integer> set = new HashSet<>();
        int n = a.length;

//        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};

        for (int i = 0; i < n; i++) {
            int sum = a[i];
            for (int j = i + 1; j < n; j++) {
                sum += a[j];
            }
            set.add(sum);
        }
        log.info("Sum :" + set);

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(a));
    }
}
