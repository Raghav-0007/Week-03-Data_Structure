package com.sorting.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices={200, 120, 500, 650, 900, 290, 560, 550, 230};
        SortProductPrices.sortProductPrices(prices, 0, prices.length-1);
        System.out.println(Arrays.toString(prices));
    }
}
