package com.sorting.mergesort;

import java.util.ArrayList;
import java.util.List;

public class SortArrayBookPrices {
//    List<Integer> list=new ArrayList<>();
    public static void sortPrices(int[] arr, int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            sortPrices(arr, low, mid);
            sortPrices(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int[] arr2=new int[arr.length];
        int i=low;
        int j=mid+1;
        int k=low;

        while (i<=mid && j<=high){
            if(arr[i]<arr[j]){
                arr2[k]=arr[i];
                i++;
            }
            else {
                arr2[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid){
            arr2[k]=arr[i];
            i++;
            k++;
        }

        while (j<=high){
            arr2[k]=arr[j];
            j++;
            k++;
        }
        for(int p=low; p<=high; p++){
            arr[p]=arr2[p];
        }
    }
}
