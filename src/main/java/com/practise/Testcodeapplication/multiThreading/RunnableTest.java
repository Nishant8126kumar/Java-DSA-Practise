package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableTest {

    public void testThread() throws InterruptedException {
        Runnable runnableOne = () -> {
            log.info("Thread Id :" + Thread.currentThread().getId());
        };
        new Thread(runnableOne).start();
        Runnable runnableTwo = () -> {
            log.info("Thread Id :" + Thread.currentThread().getId());
        };
        Thread.sleep(2000);
        new Thread(runnableTwo).start();
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableTest runnableTest = new RunnableTest();
        runnableTest.testThread();
    }
}
