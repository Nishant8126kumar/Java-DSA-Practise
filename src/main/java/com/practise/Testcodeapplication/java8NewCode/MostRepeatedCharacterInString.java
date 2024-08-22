package com.practise.Testcodeapplication.java8NewCode;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class MostRepeatedCharacterInString {

    public static void main(String[] args) {
        String str = "Nishant Sharma";

        Map<Character,Long> map = str.replace(" ", "").chars().mapToObj(it -> (char) it)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue())
                .stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        log.info("Map :"+map);
    }

}
