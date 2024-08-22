package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class CountCharacterInString {
    public static void main(String[] args) {

        String str = "Nishant Pandit".replace(" ","");

        String[] strArray = str.split("");
        Map<String, Long> map = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        log.info("Map :" + map);

    }
}
