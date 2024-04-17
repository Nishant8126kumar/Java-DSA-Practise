package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CyclicallyRotateArrayByOne {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        int n = arrays.length;

        log.info("Length :" + n);

        int x = arrays[n - 1];
        log.info("X :" + x);

        for(int i=n-1;i>0;i--)
        {
            arrays[i]=arrays[i-1];
        }
        arrays[0]=x;
        for(int i: arrays)
        {
            System.out.print(i +" ");
        }


    }
}
