package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadCommunicationDemo {

    boolean partOneIsDone = false;

    synchronized public void firstExecution() {
        try {

            log.info("Welcome from first thread execution");
            log.info("Now first thread is going to surrender :");
            partOneIsDone=true;
            notify();
        } catch (Exception ex) {
            log.info("Exception occurred from firstExecution :" + ex.getMessage());
        }
    }

    synchronized public void secondExecution() {
        try {

            log.info("Hi welcome from second thread execution :");
            if (!partOneIsDone) {
                wait();
            }
            log.info("Execution after notify from firstThread execution :");
            log.info("When you are planning to visit india  :");
        } catch (Exception ex) {
            log.info("Exception occurred from firstExecution :" + ex.getMessage());
        }
    }
    synchronized public void thirdExecution() {
        try {

            log.info("Hi i am from third thread");
            wait();
            log.info("Hi after wait from Third thread");
        } catch (Exception ex) {
            log.info("Exception occurred from firstExecution :" + ex.getMessage());
        }
    }

    public static void main(String[] args) {

        ThreadCommunicationDemo obj = new ThreadCommunicationDemo();

        Thread t1 = new Thread(obj::firstExecution);
        Thread t2 = new Thread(obj::secondExecution);
        Thread t3 = new Thread(obj::thirdExecution);

        t2.start();
        t3.start();
        t1.start();

    }
}
