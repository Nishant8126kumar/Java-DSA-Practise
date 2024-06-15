package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class FirstDuplicateElementInArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1,6,6,8,7,9,8,7,9};



        List list= Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(it->it.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getKey))
                .values().stream().collect(Collectors.toList());

       log.info("Map :"+list);


    }
}
