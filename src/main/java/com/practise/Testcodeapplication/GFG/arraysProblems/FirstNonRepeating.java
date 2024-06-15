package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class FirstNonRepeating {
    public static long firstNonRepeating(int[] arr, int n) {

        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(it -> it.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        log.info("Map :" + map);

        for (int i : arr) {
            if (map.containsKey(i)) {
                return i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        long x = firstNonRepeating(arr, arr.length);
        log.info("Value :" + x);

    }
}
