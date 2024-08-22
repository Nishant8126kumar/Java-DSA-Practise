package com.practise.Testcodeapplication.GFG_new_problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseString {
    public static void main(String[] args) {

        String str = "Nishant";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
