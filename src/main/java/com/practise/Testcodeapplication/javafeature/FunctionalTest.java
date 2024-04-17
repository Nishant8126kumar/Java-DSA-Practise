package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;
import java.util.function.Predicate;

@Slf4j
public class FunctionalTest {
    public static void main(String[] args) {
        Consumer<String> consumer = it -> {
            System.out.println("Value :" + it);
        };
        consumer.accept("Nishant");

        Predicate<String> predicate = it -> it.equalsIgnoreCase("Nishant");
        log.info("Predicate value :" + predicate.test("Nishant"));
    }
}
