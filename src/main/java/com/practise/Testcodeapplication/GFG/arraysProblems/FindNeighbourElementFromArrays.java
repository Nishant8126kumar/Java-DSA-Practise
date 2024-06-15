package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindNeighbourElementFromArrays {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 15};
        int size = array.length;
        int neighbourElement=0;

        for (int i = 1; i < size - 1; i++) {
            if (array[i] >= array[i - 1] && array[i] > array[i + 1]) {
                neighbourElement = array[i];
                break;
            }
        }
        log.info("Neighbour Element is :"+neighbourElement);
    }
}
