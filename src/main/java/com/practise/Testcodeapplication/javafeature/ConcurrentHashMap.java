package com.practise.Testcodeapplication.javafeature;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentMap;

@Slf4j
public class ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentMap<String,String> concurrentMap=new java.util.concurrent.ConcurrentHashMap();
//        concurrentMap.put("Name","Nishant");
        concurrentMap.put("Address","Aligarh");
        concurrentMap.put("Contact","8126632693");
        log.info("Map Values :"+concurrentMap);
        log.info("GetOrDefault :" +concurrentMap.getOrDefault("Address","Noida"));
        log.info("PutIfAbsent :"+concurrentMap.putIfAbsent("Name","Aman"));
    }
}
