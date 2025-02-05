package com.searching.binarysearch.findpeakelement;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 2, 6, 4};

        int peak=FindPeakElement.findPeakElement(arr, 0, arr.length-1);
        System.out.println(peak);
    }
}
