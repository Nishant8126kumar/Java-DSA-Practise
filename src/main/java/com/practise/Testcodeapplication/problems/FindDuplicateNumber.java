package com.practise.Testcodeapplication.problems;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
public class FindDuplicateNumber {
    public static void main(String[] args) {

        int[] arr = {0, 3, 1, 2};
        duplicates(arr, arr.length);


    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < n; i++) {

        }

        log.info("List :" + list);
        return list;
    }
}
