package com.practise.Testcodeapplication.soperaSteria;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class NonRepeatIndexInString {
    public static void main(String[] args) {
        String name = "raman";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            if (map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
            } else {
                map.put(name.charAt(i), 1);
            }
        }
        log.info("Map :" + map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(" " + entry.getKey());
            } else {
                System.out.print(" " + entry.getKey());
            }
        }
    }
}
