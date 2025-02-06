package com.searching.linearsearch.firstnegativenumber;

public class FirstNegativeNumber {

    public static int searchFirstNegative(int[] arr){
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0)
                return arr[i];
        }
        return 0;
    }
}
