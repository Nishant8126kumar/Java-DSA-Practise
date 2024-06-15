package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JoinMethodTest {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hii");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hello");
            }
        });

        t1.start();
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            log.info("Exception while thread sleep :" + ex.getMessage());
        }
        t2.start();
        t1.join();
        t2.join();
        ;
        System.out.println("Execution done.");

    }
}
