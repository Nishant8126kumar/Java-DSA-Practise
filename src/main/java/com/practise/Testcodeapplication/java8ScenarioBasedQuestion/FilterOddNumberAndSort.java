package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class FilterOddNumberAndSort {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,34,22,13,55,4,3,87,11,22,12);

        List<Integer> filteredList=numbers.stream().filter(it->it%2==0).sorted().collect(Collectors.toList());

        log.info("Filter List :"+filteredList);


    }
}
