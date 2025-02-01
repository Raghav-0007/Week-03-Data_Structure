package com.sorting.quicksort;

public class SortProductPrices {

    public  static void sortProductPrices(int[] arr, int low, int high){
        if(low<high){
            int ptIndex=partitionNumber(arr, low, high);
            sortProductPrices(arr, low, ptIndex-1);
            sortProductPrices(arr, ptIndex+1, high);
        }
    }

    public static int partitionNumber(int[] arr, int low, int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;

        do{
            while (i<=high && arr[i]<=pivot){
                i++;
            }
            while (j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while (i<j);

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
}
