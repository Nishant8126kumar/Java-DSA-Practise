package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GivenIntegerSumWithArrays {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        int sum = 23;
        List<Integer> eleList = new ArrayList<>();

        boolean  found=false;

        for (int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                eleList.add(arr[j]);
                int listSum = eleList.stream().mapToInt(it -> it).sum();
                if (listSum == sum) {
                    log.info(sum + " =:" + eleList);
                    found=true;
                    break;
                }
            }
            if (!found)
                eleList.clear();

        }
    }
}
