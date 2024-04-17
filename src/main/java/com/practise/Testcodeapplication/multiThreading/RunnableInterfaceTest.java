package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableInterfaceTest implements Runnable {
    @Override
    public void run() {
        log.info("Thread Name :" + Thread.currentThread().getName());
        log.info("Thread Id :" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        RunnableInterfaceTest runnableThreadOne = new RunnableInterfaceTest();
        Thread threadOne = new Thread(runnableThreadOne);
        threadOne.start();

        RunnableInterfaceTest runnableThreadTwo = new RunnableInterfaceTest();
        Thread threadTwo = new Thread(runnableThreadOne);
        threadTwo.start();
    }
}
