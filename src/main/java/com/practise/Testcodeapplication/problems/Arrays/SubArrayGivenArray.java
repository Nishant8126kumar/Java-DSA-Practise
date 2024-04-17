package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SubArrayGivenArray {

    public static void main(String[] args) {
        int []array = {1,2,3,7,5};
        int n = array.length;
        int sum = 12;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int arraySum = array[i];
            for (int j = i + 1; j < n; j++) {
                arraySum += array[j];
                if (arraySum == sum) {
                    list.add(i + 1);
                    list.add(j + 1);
                    break;
                }
            }
            if (!list.isEmpty())
                break;
        }
        log.info("List :"+list);
    }
}

