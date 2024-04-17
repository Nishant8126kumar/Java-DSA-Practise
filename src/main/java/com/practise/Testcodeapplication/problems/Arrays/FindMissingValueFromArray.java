package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
public class FindMissingValueFromArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 4, 5, 2};
        int n = array.length;
        List<Integer> list = new ArrayList<>();
        for (int x : array) {
            list.add(x);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!list.contains(i)) {
                ans = i;
                break;
            }
        }

        log.info("Missing value is :" + ans);

    }
}
