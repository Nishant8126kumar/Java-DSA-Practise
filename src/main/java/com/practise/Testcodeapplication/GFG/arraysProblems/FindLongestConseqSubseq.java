package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class FindLongestConseqSubseq {
    static int findLongestConseqSubseq(int[] arr, int n) {

        Arrays.sort(arr);
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int ans = 0, count = 0;
        List<Integer> list = new ArrayList<>(set);
        log.info("List :" + list);
        for (int i = 0; i < list.size(); i++) {

//            if (i == 0) {
//                count = 1;
//            }
            if (i > 0 && list.get(i) == (list.get(i - 1)) + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);


        }
        log.info("Ans :" + ans);
        return count;

    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
//        int arr[] = {0, 1, 1, 1, 1, 1, 2};
//        int arr[] = {34, 2, 7, 23, 31, 38, 13, 11, 37, 19, 45, 6};
        int n = arr.length;
        log.info("Count :" + findLongestConseqSubseq(arr, n));


    }
}
