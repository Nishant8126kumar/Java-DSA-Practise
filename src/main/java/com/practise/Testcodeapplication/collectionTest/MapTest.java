package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        Map<Integer,String> treeMap=new TreeMap<>();
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();

        /**
         * In hashMap we can maintain null key
         * HashMap does not maintain insertion order in java.
         */
        hashMap.put(null,"Nishant");
        hashMap.put(5,"Nishant");
        hashMap.put(4,"Aman");
        hashMap.put(3,"Dileep");
        hashMap.put(2,"Naman");
        hashMap.put(1,"Shivam");

        /**
         * In treeMap.put(null,"Nishant") we can't maintain null key
         * treeMap maintain natural order in java.
         */
        treeMap.put(5,"Nishant");
        treeMap.put(4,"Aman");
        treeMap.put(3,"Dileep");
        treeMap.put(2,"Naman");
        treeMap.put(1,"Shivam");

        /**
         * In linkedHashMap.put(null,"Nishant") we can maintain null key
         * treeMap maintain insertion order in java.
         */
        linkedHashMap.put(null,"Nishant");
        linkedHashMap.put(5,"Nishant");
        linkedHashMap.put(4,"Aman");
        linkedHashMap.put(3,"Dileep");
        linkedHashMap.put(2,"Naman");
        linkedHashMap.put(1,"Shivam");


        log.info("HashMap :"+hashMap);
        log.info("TreeMap :"+treeMap);
        log.info("LinkedHash Map :"+linkedHashMap);
    }
}
