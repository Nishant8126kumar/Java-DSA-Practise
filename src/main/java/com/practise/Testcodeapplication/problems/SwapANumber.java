package com.practise.Testcodeapplication.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwapANumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//        int c=30;

        a=a+b;
        b=a-b;
//        a=a-b;

        log.info("A :"+a);
        log.info("B :"+b);

    }
}
