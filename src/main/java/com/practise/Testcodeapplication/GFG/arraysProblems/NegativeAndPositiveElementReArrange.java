package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class NegativeAndPositiveElementReArrange {

    public static void reArrange(int[] arr, int n) {

        List<Integer> negativeList = new ArrayList<>();
        List<Integer> positiveList = new ArrayList<>();

        for (int i : arr) {
            if (i < 0) {
                negativeList.add(i);
            } else {
                positiveList.add(i);
            }
        }
        int index = 0;
        for (int i = 0, j = 0; i < positiveList.size() || j < negativeList.size(); i++, j++) {
            if (i < positiveList.size()) {
                arr[index] = positiveList.get(i);
                index++;
            }
            if (j < negativeList.size()) {
                arr[index] = negativeList.get(i);
                index++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        reArrange(arr, arr.length);

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }
}
//-5, 5, -2, 2, -8, 4, 7, 1, 8, 0
