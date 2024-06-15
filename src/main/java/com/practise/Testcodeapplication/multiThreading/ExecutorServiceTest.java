package com.practise.Testcodeapplication.multiThreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class ExecutorServiceTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future futureTask=executorService.submit(() -> {
            return"ss";
        });
        log.info("Future :"+futureTask.get());
        executorService.shutdown();

    }
}
