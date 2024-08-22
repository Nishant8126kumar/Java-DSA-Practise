package com.practise.Testcodeapplication.java8NewCode;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class CountCharacterInStringNew {
    public static void main(String[] args) {
        String str = "Nishant kumar";

        Map<Character, Long> map = str.replace(" ", "").chars().mapToObj(it -> (char) it).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}

