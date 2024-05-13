package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class FirstDuplicateElementInArrays {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 1};
        List list=Arrays.asList(array);
        log.info("List :"+list);


        Arrays.asList(array).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println("Key " + key + " value :" + value));


//       log.info("Map :"+map);


    }
}
