package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class KtSmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = {7, 10,4,3,20,15};
        int k=3;
        Arrays.sort(arr);
        log.info(k+ "lergest element is :"+arr[k-1]);

    }
}
