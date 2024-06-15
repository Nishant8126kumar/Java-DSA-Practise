package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class ToCheckHowManyCharacterRequestForAnagramString {
    public static void main(String[] args) {
        String str1 = "umr";
        String str2 = "cat";
        str1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        str2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());
        log.info("Str1 :" + str1);
        log.info("Str2 :" + str2);
        int num = 0;
        if (!str1.equalsIgnoreCase(str2)&&str1.length()==str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    num++;
                }
            }
        }else {
            num=str1.length()-str2.length();
        }
        log.info("Num :" + num);


    }
}
