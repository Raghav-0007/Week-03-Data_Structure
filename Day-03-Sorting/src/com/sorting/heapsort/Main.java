package com.sorting.heapsort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12000, 11000, 13000, 5000, 6000, 7000};

        SortJobApplicantsBySalary sj = new SortJobApplicantsBySalary();
        sj.heapSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
