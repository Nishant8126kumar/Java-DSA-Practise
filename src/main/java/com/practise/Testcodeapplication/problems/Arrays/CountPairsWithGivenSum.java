package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

@Slf4j
public class CountPairsWithGivenSum {

    public static void main(String[] args) {

        int[] array = {1,5, 7, 1};
        int k = 6;
        int sumCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    log.info(array[i]+" + "+array[j]);
                    sumCount++;
                }
            }
        }
        log.info("Sum count :" + sumCount);
    }
}
