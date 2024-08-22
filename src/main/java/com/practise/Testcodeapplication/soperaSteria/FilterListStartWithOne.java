package com.practise.Testcodeapplication.soperaSteria;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class FilterListStartWithOne {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(21, 11, 40, 15);
//
//        List<Integer> filteredList = list.stream().filter(it -> it.toString().startsWith("1"))
//                .collect(Collectors.toList());
//        log.info("Filtered List :" + filteredList);

        Integer x=10;
        log.info("Value :"+x);
        modify(x);
        log.info("Value :"+x);
    }
    private static void modify(Integer i) {
        i = i + 1;
    }
}
