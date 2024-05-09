package com.practise.Testcodeapplication.incedo_interview_code;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class PrintNumberWithFrequency {
    public static void main(String[] args) {
        List<Integer> interList = Arrays.asList(5, 3, 8, 9, 2, 6, 3, 8, 3, 6, 2, 8);

        List<Integer> listWithFreq = new ArrayList<>();

        Map<Integer, Long> map = interList.stream().collect(Collectors.groupingBy(it -> it, Collectors.counting()));
        log.info("Map :" + map);
        interList.stream().collect(Collectors.groupingBy(it -> it, Collectors.counting())).forEach((key, value) -> {
            for (int i = 1; i <= value; i++) {
                listWithFreq.add(key);
            }
        });
        log.info("Set value is :" + listWithFreq);
    }
}
