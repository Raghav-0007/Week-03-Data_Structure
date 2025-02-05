package com.searching.binarysearch.findrotationpoint;

public class Main {
    public static void main(String[] args) {
        // Rotate array
        int[] numbers = {40, 50, 60, 10, 20, 30};

        // call the method
        int startPoint=FindRotationPoint.findRotationPoint(numbers, 0, numbers.length-1);
        System.out.println(startPoint);
    }
}
