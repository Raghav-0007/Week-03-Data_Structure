package com.searching.binarysearch.findpeakelement;

public class FindPeakElement {

    public static int findPeakElement(int[] arr, int left, int right){
        int mid=(left+right)/2;
        if(arr[mid]<arr[mid-1]){
            return findPeakElement(arr, left, mid);
        }
        if(arr[mid]>arr[mid]-1){
            if(arr[mid]>arr[mid+1])
                return arr[mid];
            return findPeakElement(arr, mid+1, right);
        }
        return -1;
    }
}
