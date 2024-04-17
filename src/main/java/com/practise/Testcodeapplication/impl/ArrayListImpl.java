package com.practise.Testcodeapplication.impl;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class ArrayListImpl {

    int[] arr;
    @Getter
    int capacity;
    @Getter
    int current;

    public ArrayListImpl() {
        arr = new int[1];
        capacity = 1;
        current = 0;
    }

    public void push(int element) {
        if (current == capacity) {
            int[] temp = new int[capacity * 2];
            if (capacity >= 0)
                System.arraycopy(arr, 0, temp, 0, capacity);
            capacity *= 2;
            arr = temp;
        }
        arr[current] = element;
        current++;
    }

    public void push(int element, int index) {
        if (current == capacity) {
            push(element);
        } else {
            arr[index] = element;
        }
    }

    public int peek(int index) {
        if (index >-1 && index < current) {
            return arr[index];
        }
        return -1;

    }

    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
//        arrayList.push(1);
//        arrayList.push(2);
//        arrayList.push(3);
//        arrayList.push(4);
        arrayList.push(5);
//        arrayList.push(90, 6);
        log.info("Capacity :" + arrayList.getCapacity());
        log.info("Peek :" + arrayList.peek(0));
        log.info("Array :" + Arrays.toString(Arrays.stream(arrayList.arr).toArray()));
//        List<Integer> integerList=new ArrayList<>();
//        integerList.add();
    }

}
