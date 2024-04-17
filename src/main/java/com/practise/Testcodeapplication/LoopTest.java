package com.practise.Testcodeapplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoopTest {
    public static void main(String[] args) {
        int i=0;
        for(; i<5;i++)
        {
            log.info("I --> :"+i);

        }
    }
}
