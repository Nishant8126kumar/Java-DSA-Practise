package com.practise.Testcodeapplication.soperaSteria;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class AnagramString {
    public static boolean checkStringIsAnagram(String str1, String str2) {

        String s1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        String s2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());
        log.info("S1 :" + s1);
        log.info("S2 :" + s2);
        return s1.equalsIgnoreCase(s2);

    }

    public static void main(String[] args) {
        boolean result = checkStringIsAnagram("naman", "aman");
        log.info("Result :" + result);

    }
}
