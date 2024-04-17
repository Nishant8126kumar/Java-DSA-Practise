package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MoveAllNegativeElementOneSide {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};

        //Answer will be like --> 1 3 2 11 6 -1 -7 -5

        List<Integer> positiveList = new ArrayList<>();
        List<Integer> newgativeList = new ArrayList<>();
        for (int j : arr) {
            if (j > 0) {
                positiveList.add(j);

            } else {
                newgativeList.add(j);
            }
        }
        int k = 0;
        for (int x : positiveList) {
            arr[k] = x;
            k++;
        }
        for (int x : newgativeList) {
            arr[k] = x;
            k++;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
