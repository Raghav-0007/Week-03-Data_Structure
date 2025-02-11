package com.problemstatement.searchcomparison;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000}; // Dataset sizes
        Random rand = new Random();

        SearchComparison sc=new SearchComparison();

        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(size * 10); // Random numbers
            }

            int target = data[rand.nextInt(size)]; // Random target from dataset

            // Linear Search Timing
            long start = System.nanoTime();
            sc.linearSearch(data, target);
            long linearTime = System.nanoTime() - start;

            // Sort the data for Binary Search
            Arrays.sort(data);

            // Binary Search Timing
            start = System.nanoTime();
            sc.binarySearch(data, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1e6 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1e6 + " ms");
            System.out.println("----------------------------------");
        }
    }

    }
