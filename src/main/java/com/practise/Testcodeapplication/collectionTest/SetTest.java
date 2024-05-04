package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class SetTest {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        /**
         * hashSet.add(null) we can maintain one null value in hashSet
         * Maintain unique data no duplicate value allow
         */

        hashSet.add(null);//
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);


        /**
         * treeSet.add(null); tree set not allowed null value
         * Maintain unique data no duplicate value allow
         */
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);

        /**
         * // we can maintain one null value in linkedHashSet
         * Data arrange in insertion order only.
         * Maintain unique data no duplicate value allow
         */
        linkedHashSet.add(null);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);

        log.info("Tree Set :" + treeSet);
        log.info("Hash Set :" + hashSet);
        log.info("LinkedHash Set :" + linkedHashSet);


    }
}
