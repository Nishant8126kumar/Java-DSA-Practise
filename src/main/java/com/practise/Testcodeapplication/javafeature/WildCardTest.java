package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class WildCardTest {
    public static void main(String[] args) {
        List<Integer> interList = Arrays.asList(1, 2, 3, 4, 5);
        log.info("Sum with upper wild card :" + WildCardTest.sumWithUpperBoundWildCard(interList));
        List<Number> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);
        log.info("Sum with lower bound wild card :" + WildCardTest.sumWithLowerBoundWildCard(numberList));
    }

    public static Long sumWithUpperBoundWildCard(List<? extends Number> list) {
        return list.stream().mapToLong(Number::longValue).sum();
    }

    public static Double sumWithLowerBoundWildCard(List<? super Integer> list) {
        return list.stream().mapToDouble(it -> Double.parseDouble(String.valueOf(it))).sum();
    }

}
