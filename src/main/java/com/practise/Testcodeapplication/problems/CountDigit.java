package com.practise.Testcodeapplication.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountDigit {
    public static void main(String[] args) {
        int x=12345;
        int length=String.valueOf(x).split("").length;
        log.info("Length :"+length);
    }
}
