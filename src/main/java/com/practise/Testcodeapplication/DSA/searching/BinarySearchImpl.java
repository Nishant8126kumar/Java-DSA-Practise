package com.practise.Testcodeapplication.DSA.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchImpl {
    public static int searchElementInArray(int[] array, int n, int element) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element)
                return mid;
            else if (element > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 1;
        //For binary search data should be in sorted order.
        int foundElement = searchElementInArray(array, array.length, element);
        if (foundElement >= 0) {
            log.info("Element " + array[foundElement] + " is preset on this position :" + foundElement);
        } else {
            log.info("Element " + element + " not found");
        }

    }
}
