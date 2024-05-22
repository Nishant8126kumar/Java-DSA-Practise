package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class GroupByWithWordCount {
    public static void main(String[] args) {
        String str = "this is a macbook and this is a sleek";

        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(it -> it.getKey().equals("is") || it.getKey().equals("a"))
                .forEach((it) -> System.out.println(it.getKey() + "-" + it.getValue()));
        log.info("Map :" + map);


    }
}
