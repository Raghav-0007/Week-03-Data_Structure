package com.sorting.selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scores={200, 120, 500, 650, 900, 290, 560, 550, 230};
        SortExamScores.sortScore(scores);
        System.out.println(Arrays.toString(scores));
    }
}
