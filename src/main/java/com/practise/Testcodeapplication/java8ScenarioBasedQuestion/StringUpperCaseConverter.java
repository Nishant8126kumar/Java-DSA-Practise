package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StringUpperCaseConverter {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("java", "python", "react", "javascript");

        List<String> upperCaseString = strings.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());

        log.info("Upper case string is :"+upperCaseString);
    }

}
