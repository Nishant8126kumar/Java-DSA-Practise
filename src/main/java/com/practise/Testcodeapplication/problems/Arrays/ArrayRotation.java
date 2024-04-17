package com.practise.Testcodeapplication.problems.Arrays;

 public class ArrayRotation {
    public static void main(String[] args) {
        int[] input = {8, 3, -4, 11, 4, 0};
        int rotateValue = 3;

        for (int index = 0; index < rotateValue; index++) {
            int temp = input[0];
            int i = 1;
            for (; i < input.length; i++) {
                input[i - 1] = input[i];
            }
            input[i-1] = temp;
        }
        for(int x:input)
        {
            System.out.print(x+" ");
        }
    }
}
