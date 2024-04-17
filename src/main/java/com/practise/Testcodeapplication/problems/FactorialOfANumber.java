package com.practise.Testcodeapplication.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactorialOfANumber {
    public int fact(int n) {
        log.info("Value of N :" + n);
        if (n <= 1) {
            log.info("Need exit .");
            return 1;
        } else {
            int value = n * fact(n - 1);
            return value;
        }
    }

    public void test() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                log.info("Terminate :" + i);
                return;
            } else {
                log.info("I -:" + i);
            }

        }
    }

    public static void main(String[] args) {
        FactorialOfANumber fct = new FactorialOfANumber();
//        int factorial = fct.fact(3);
        fct.test();
//        log.info("Factorial :" + factorial);
    }
}
