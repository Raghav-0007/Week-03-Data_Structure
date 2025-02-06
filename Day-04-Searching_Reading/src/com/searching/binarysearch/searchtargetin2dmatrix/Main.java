package com.searching.binarysearch.searchtargetin2dmatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result= SearchTargetIn2DMatrix.searchTarget(arr, 1, 0, 8);
        System.out.println(Arrays.toString(result));
    }
}
