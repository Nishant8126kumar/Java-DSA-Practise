package com.practise.Testcodeapplication.interfaceTest;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class PredicateInterfaceTest {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (value) -> {
            if (value == 2) {
                return true;
            } else {
                return false;
            }
        };
        log.info("Result :"+predicate.test(2));
    }
}
