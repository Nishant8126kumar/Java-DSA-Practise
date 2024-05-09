package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReArrangeArrayElement {

    static void rearrange(int arr[], int n) {



//        {-12, 11, -13, -5, 6, -7, 5, -3, 11};
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }


    }

    static void display(int[] arr, int right) {
        for (int i = 0; i <= right; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, 11};

        int arr_size = arr.length;

        // Function Call
        rearrange(arr, arr_size - 1);
        display(arr, arr_size - 1);
    }
}
