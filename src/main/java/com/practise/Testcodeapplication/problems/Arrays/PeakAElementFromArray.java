package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeakAElementFromArray {
    public static void main(String[] args) {
        int array[] = {5, 10, 20, 15};
        int peakElement = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
                peakElement = array[i];
            }
        }
        log.info("Peak Element is :"+peakElement);
    }
}
