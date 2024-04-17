package com.practise.Testcodeapplication.interfaceTest;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class FunctionInterfaceTest {
    public static void main(String[] args) {


        Function<String,Integer> integerFunction= String::length;
        log.info("Test value length :"+integerFunction.apply("Nishant"));
    }
}
