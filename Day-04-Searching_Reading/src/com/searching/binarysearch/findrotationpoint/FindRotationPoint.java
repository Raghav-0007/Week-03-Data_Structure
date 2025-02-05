package com.searching.binarysearch.findrotationpoint;

public class FindRotationPoint {

    // find the rotation point
    public static int findRotationPoint(int[] arr, int left, int right){
        if(left==right){
            return arr[left];
        }
        int mid=(left+right)/2;
        if(arr[mid]>arr[right])
            return findRotationPoint(arr, mid+1, right);
        if(arr[mid]<arr[right])
            return findRotationPoint(arr, left, mid);
        return -1;
    }
}
