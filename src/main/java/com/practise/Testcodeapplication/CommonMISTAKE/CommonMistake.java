package com.practise.Testcodeapplication.CommonMISTAKE;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonMistake {
    public static void main(String[] args) {

        String str = null;
        if ("Aman".equalsIgnoreCase(str)) {
            log.info("If :");
        }else {
            log.info("Else :");
        }

    }
}
