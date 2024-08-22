package com.practise.Testcodeapplication.GFG_new_problems.java8Stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class CharacterCountInString {
    public static void main(String[] args) {

        String str = "Nishant Kumar Sharma";


        Map<String, Long> map = str.replace(" ", "").chars().mapToObj(it -> (char) it)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().collect(Collectors.toMap(it -> it.getKey() + " count is:", Map.Entry::getValue));
        log.info("Map :" + map);


    }
}
