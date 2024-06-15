package com.practise.Testcodeapplication.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FibonacciSeries {
    public static void main(String[] args) {

        int limit = 10;
        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 1; i < limit; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }

    }
}
