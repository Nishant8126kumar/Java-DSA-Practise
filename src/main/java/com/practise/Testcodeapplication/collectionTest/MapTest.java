package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(5,"Nishant");
        hashMap.put(4,"Aman");
        hashMap.put(3,"Nitin");
        hashMap.put(2,"Ankit");
        hashMap.put(1,"Sandeep");

        log.info("Hash Map values :"+hashMap);

        Map<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(5,"Nishant");
        treeMap.put(4,"Aman");
        treeMap.put(3,"Nitin");
        treeMap.put(2,"Ankit");
        treeMap.put(1,"Sandeep");

        log.info("TreeMap value :"+treeMap);
    }
}
