package com.practise.Testcodeapplication.collectionTest;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        log.info("Before sort List :" + list);
        list.sort(Comparator.comparingInt(it -> it));
        log.info("After sort List :" + list);

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            log.info("Element is :" + iterator.next());
        }
    }
}
