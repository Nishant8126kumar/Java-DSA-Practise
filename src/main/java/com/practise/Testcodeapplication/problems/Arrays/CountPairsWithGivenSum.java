package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class CountPairsWithGivenSum {

    public static void main(String[] args) {

//        int[] array = {1,5, 7, 1};
//        int k = 6;
//        int sumCount = 0;
////        new ArrayList<>().size()
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] + array[j] == k) {
//                    log.info(array[i]+" + "+array[j]);
//                    sumCount++;
//                }
//            }
//        }
//        log.info("Sum count :" + sumCount);

        int[] arr={3,4,12,3,12,3,4,4,12,7,11,6,5};

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!set.add(i))
            {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }


        log.info("List :" + list);
    }
}
