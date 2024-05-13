package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class WordCount {

    public static void main(String[] args) {
        String[] str = {"acb","acb", "bac", "cbad", "xzy", "yxz", "zyx"};

//        Arrays.asList(str).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().forEach(it->{
//                    System.out.println(it.getKey() +" "+it.getValue());
//                });

        Arrays.stream(str).sorted().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(k -> System.out.println(k.getKey() +"-"+k.getValue()));

    }
}
