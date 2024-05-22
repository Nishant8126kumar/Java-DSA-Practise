package com.practise.Testcodeapplication.problems.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockBuySellCalculation {

    static int getMaxProfit(int[] arr) {
//        {7, 1, 5, 3, 6, 4};
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        int max=arr[minIndex];
        for (int i = minIndex; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};

        int profit = getMaxProfit(prices);
        log.info("Profit :" + profit);


    }
}
