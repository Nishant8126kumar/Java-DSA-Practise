package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        log.info("Values set :"+set.add(5));
    }

}
