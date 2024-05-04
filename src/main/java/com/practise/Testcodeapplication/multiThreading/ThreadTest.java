package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            log.info("From runnable thread .");
        };
        runnable.run();

        Thread thread=new Thread();
        thread.start();;

    }
}
