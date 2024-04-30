package com.practise.Testcodeapplication.DSA.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinearSearch {

    public static int searchElementInArray(int[] arr, int n, int element) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 3;
        int foundElement = searchElementInArray(array, array.length, element);
        if (foundElement >= 0) {
            log.info("Element " + array[foundElement] + " is preset on this position :" + foundElement);
        } else {
            log.info("Element " + element + " not found");
        }

    }
}
