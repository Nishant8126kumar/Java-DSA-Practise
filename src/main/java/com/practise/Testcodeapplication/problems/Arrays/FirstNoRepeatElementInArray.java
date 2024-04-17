package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FirstNoRepeatElementInArray {
    public static void main(String[] args) {
        int[] array = {-1, 2, -1, 3, 2};
        int n = array.length;
        int element = 0;

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], array[i] + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(array[i]) == 1) {
                element = array[i];
            }
        }
        log.info("First non repeated element is :" + element);

    }
}
