package com.searching.linearsearch.firstnegativenumber;

public class Main {
    public static void main(String[] args) {
        int[] arr={3, 4, 5, -6, 4, 2, 4, 6, 7, 8};
        int num=FirstNegativeNumber.searchFirstNegative(arr);
        System.out.println("First Negative number is: " + num);
    }
}
