package com.practise.Testcodeapplication.interfaceTest;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class ConsumerInterfaceTest {

    public static void main(String[] args) {

        Consumer<String> consumer=(value)-> {
            System.out.printf("Value :" + value);
        };
        consumer.accept("Nishant");

    }
}
