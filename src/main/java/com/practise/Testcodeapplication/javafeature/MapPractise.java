package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class MapPractise {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(5,"Aman");
        map.put(4,"Shivam");
        map.put(3,"Naman");
        map.put(2,"Nishant");
        map.put(1,"Dileep");
        map.put(null,"Suresh");
        log.info("Map values :"+map);
    }
}
