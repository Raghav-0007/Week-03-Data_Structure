package com.problemstatement.fibonaccicomputation;

public class Main {
    public static void main(String[] args) {
        int[] testCases = {10, 30, 50};

        for (int n : testCases) {
            long start, recursiveTime = -1, iterativeTime;

            // Recursive Fibonacci (only for small N)
            if (n <= 30) {
                start = System.nanoTime();
                FibonacciComparison.fibonacciRecursive(n);
                recursiveTime = System.nanoTime() - start;
            }

            // Iterative Fibonacci
            start = System.nanoTime();
            FibonacciComparison.fibonacciIterative(n);
            iterativeTime = System.nanoTime() - start;

            System.out.println("Fibonacci N: " + n);
            if (recursiveTime != -1) {
                System.out.println("Recursive Time: " + (recursiveTime / 1e6) + " ms");
            } else {
                System.out.println("Recursive Time: Unfeasible");
            }
            System.out.println("Iterative Time: " + (iterativeTime / 1e6) + " ms");
            System.out.println("----------------------------------");
        }
    }

}
