package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class WordCountInString {
    public static void main(String[] args) {

        String paragraph = "Her friends always walked hand in hand with her in her difficult times.";

        //Method 1
        List<String> stringArray = Arrays.asList(paragraph.toLowerCase().split(" "));

        Map<String,Long> filterData=stringArray.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));

        log.info("Sum count :"+filterData);


    }
}
