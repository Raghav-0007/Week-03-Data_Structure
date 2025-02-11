package com.problemstatement.sortinglargedataefficiently;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000}; // Dataset sizes
        Random rand = new Random();

        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(size * 10); // Random numbers
            }

            int[] dataCopy1 = Arrays.copyOf(data, data.length);
            int[] dataCopy2 = Arrays.copyOf(data, data.length);
            int[] dataCopy3 = Arrays.copyOf(data, data.length);

            // Bubble Sort Timing
            long start = System.nanoTime();
            SortingComparison.bubbleSort(dataCopy1);
            long bubbleTime = System.nanoTime() - start;

            // Merge Sort Timing
            start = System.nanoTime();
            SortingComparison.mergeSort(dataCopy2, 0, dataCopy2.length - 1);
            long mergeTime = System.nanoTime() - start;

            // Quick Sort Timing
            start = System.nanoTime();
            SortingComparison.quickSort(dataCopy3, 0, dataCopy3.length - 1);
            long quickTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + (bubbleTime / 1e6) + " ms");
            System.out.println("Merge Sort Time: " + (mergeTime / 1e6) + " ms");
            System.out.println("Quick Sort Time: " + (quickTime / 1e6) + " ms");
            System.out.println("----------------------------------");
        }
    }
}
