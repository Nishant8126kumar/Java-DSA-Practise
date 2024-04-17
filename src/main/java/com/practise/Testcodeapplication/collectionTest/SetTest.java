package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class SetTest {

    public static void main(String[] args) {

        Set<String> hashSet=new HashSet<>();
        hashSet.add("Nishant");
        hashSet.add("Aman");
        hashSet.add("Shivam");
        hashSet.add("Ram");
        hashSet.add("Aaaa");
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("Raman");
        treeSet.add("Shivam");
        treeSet.add("Aaa");
        treeSet.add("Ram");
        treeSet.add("Dileep");

        log.info("Has code:" +treeSet.hashCode());
        log.info("Hash set values :"+hashSet);
        log.info("Tree set values :"+treeSet);
    }
}
