package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;

@Slf4j
public class BiFunctionTest {

    public static int sum(int x,int y)
    {
        return  x+y;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=BiFunctionTest::sum;

        log.info("Sum is :"+biFunction.apply(10,20));

    }


}
