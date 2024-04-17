package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadClassTest extends Thread {

    @Override
    public void run() {
//        super.run();
        log.info("Thread Name :" + Thread.currentThread().getName());
        log.info("Thread Id :"+Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        ThreadClassTest threadOne=new ThreadClassTest();
        threadOne.setName("Thread first ");
        threadOne.start();

        ThreadClassTest threadTwo=new ThreadClassTest();
        threadTwo.setName("Thread Two ");
        threadTwo.start();

    }


}
