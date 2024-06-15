package com.practise.Testcodeapplication.GFG.arraysProblems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoveAllNegativeElementToEnd {
    public static void main(String[] args) {
        int[] arrays = {1, -1, 3, 2, -7, -5, 11, 6};
        int size = arrays.length;
        int[] copyArray = new int[size];
        /*
        1 3 2 -7 -5 11 6 -1
        1 3 2 -5 11 6 -1 -7
        1 3 2 11 6 -1 -7 -5
         */
        int index = size - 1;
        int endElement = arrays[size - 1];

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arrays[i] > 0) {
                copyArray[j++] = arrays[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arrays[i] < 0) {
                copyArray[j++] = arrays[i];
            }
        }
        for (int x : copyArray) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        for (int x : arrays) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.arraycopy(copyArray,0,arrays,0,size);

        for (int x : arrays) {
            System.out.print(x + " ");
        }
    }
}
