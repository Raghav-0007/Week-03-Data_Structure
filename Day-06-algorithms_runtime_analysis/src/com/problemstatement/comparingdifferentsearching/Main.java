package com.problemstatement.comparingdifferentsearching;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        Random rand = new Random();

        for (int size : sizes) {
            int[] arr = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Fill data structures
            for (int i = 0; i < size; i++) {
                int value = rand.nextInt(size * 10);
                arr[i] = value;
                hashSet.add(value);
                treeSet.add(value);
            }

            int target = arr[size / 2]; // Pick a middle element

            // Measure Array Search Time
            long start = System.nanoTime();
            SearchComparison.arraySearch(arr, target);
            long arrayTime = System.nanoTime() - start;

            // Measure HashSet Search Time
            start = System.nanoTime();
            SearchComparison.hashSetSearch(hashSet, target);
            long hashSetTime = System.nanoTime() - start;

            // Measure TreeSet Search Time
            start = System.nanoTime();
            SearchComparison.treeSetSearch(treeSet, target);
            long treeSetTime = System.nanoTime() - start;

            // Print Results
            System.out.println("Dataset Size: " + size);
            System.out.println("Array Search Time: " + (arrayTime / 1e6) + " ms");
            System.out.println("HashSet Search Time: " + (hashSetTime / 1e6) + " ms");
            System.out.println("TreeSet Search Time: " + (treeSetTime / 1e6) + " ms");
            System.out.println("----------------------------------");
        }
    }
}
