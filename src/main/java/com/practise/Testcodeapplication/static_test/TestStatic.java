package com.practise.Testcodeapplication.static_test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestStatic {

    static String name = "Nishant";

    public  void displayName() {
        log.info("Name :" + name);
    }

    public static void main(String[] args) {

        TestStatic testStatic=new TestStatic();
//        displayName();

    }
}
