package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MapIteration {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(null, "Nishant");
        hashMap.put(5, "Nishant");
        hashMap.put(4, "Aman");
        hashMap.put(3, "Dileep");
        hashMap.put(2, "Naman");
        hashMap.put(1, "Shivam");


        for (Map.Entry<Integer, String> it : hashMap.entrySet()) {
            log.info("Key :" + it.getKey() + " value :" + it.getValue());
        }

    }
}
