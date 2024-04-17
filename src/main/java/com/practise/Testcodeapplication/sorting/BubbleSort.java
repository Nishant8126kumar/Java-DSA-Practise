package com.practise.Testcodeapplication.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }
    public static void sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
