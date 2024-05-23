package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class FindMostRepeatedElementInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,2,1,2,2};

       Map.Entry entry=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(it->it,Collectors.counting()))
               .entrySet()
               .stream().min(Map.Entry.comparingByValue())
               .get();
       log.info("Key :"+entry.getKey() +" : values :"+entry.getValue());

    }
}
