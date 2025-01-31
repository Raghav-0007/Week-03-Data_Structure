package com.sorting.insertionsort;

public class SortEmployeeIDs {

    public static void sortIds(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j=i-1;
            int key=arr[i];
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
           arr[j+1]=key;
        }
    }
}
