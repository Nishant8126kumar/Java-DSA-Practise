package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class AnagramStringCheck {
    public static boolean checkStringIsAnagramOrNot(String str1, String str2) {

        str1 = Arrays.asList(str1.split("")).stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(""));

        str2 = Arrays.asList(str2.split("")).stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(""));

        log.info("S1 :"+str1);
        log.info("S2 :"+str2);
        return str1.equals(str2);
    }


    public static void main(String[] args) {
        String str1 = "ram";
        String str2 = "mra";
        boolean anagramResult=checkStringIsAnagramOrNot(str1,str2);
        log.info("Result of anagram is:"+anagramResult);

    }
}
