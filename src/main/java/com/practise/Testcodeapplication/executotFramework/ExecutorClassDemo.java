package com.practise.Testcodeapplication.executotFramework;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class ExecutorClassDemo implements Callable<String> {


    @Override
    public String call() throws Exception {
        return "Hello from call method ";
    }

    public static void main(String[] args) {
        try {

            ExecutorClassDemo executorClassDemo = new ExecutorClassDemo();
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            Future<String> future = executorService.submit(executorClassDemo);
            log.info(future.get());
            executorService.shutdown();
        } catch (Exception ex) {
            log.info("Exception occurred :" + ex.getMessage());
        }

    }
}