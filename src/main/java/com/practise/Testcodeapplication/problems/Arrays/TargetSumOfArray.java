package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TargetSumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=5;
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==target)
                System.out.println(arr[i]);
            else if(arr[i]+arr[i+1]==target)
                System.out.println(arr[i] +" "+arr[i+1]);
        }
    }
}
