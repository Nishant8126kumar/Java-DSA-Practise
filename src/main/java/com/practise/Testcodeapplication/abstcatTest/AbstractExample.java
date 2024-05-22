package com.practise.Testcodeapplication.abstcatTest;

import lombok.extern.slf4j.Slf4j;

abstract public class AbstractExample {
    static int x = 10;

    public abstract int getData();

    public static int twoValueSum(int x, int y) {
        return x + y;
    }
}

interface Test {
    int x = 10;
}

@Slf4j
class TestDemo extends AbstractExample {


    public static void main(String[] args) {
        int sumValue = AbstractExample.twoValueSum(10, 20);
        log.info("Sum values :" + sumValue);
        log.info("X values :"+x);
        log.info("Abstract class x:"+AbstractExample.x);
        AbstractExample.x=20;
        log.info("Abstract class x:"+AbstractExample.x);


    }

    @Override
    public int getData() {
        return 0;
    }
}
