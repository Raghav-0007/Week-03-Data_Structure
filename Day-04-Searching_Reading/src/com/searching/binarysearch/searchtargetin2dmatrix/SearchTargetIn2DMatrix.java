package com.searching.binarysearch.searchtargetin2dmatrix;

public class SearchTargetIn2DMatrix {

    // search target in 2d matrix
    public static int[] searchTarget(int[][] arr, int target, int left, int right){
        if(left==right)
            return new int[]{-1};
        int mid=(left+right)/2;
        int numOfCol=arr[0].length;
        int row=mid/numOfCol;
        int col=mid%numOfCol;
        int midEle=arr[row][col];

        if(midEle>target)
            return searchTarget(arr, target, left, mid);
        if(midEle<target)
            return searchTarget(arr, target, mid+1, right);
        return new int[]{row, col};
    }
}
