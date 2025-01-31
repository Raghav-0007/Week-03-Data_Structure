package com.sorting.bubblesort;

import java.util.Collections;

public class SortStudentMarks {

    // method to sort marks using bubble sort
    public static void sortMarks(double[] arr){
        for(int i=0; i<arr.length; i++){
            boolean flag=false;
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                   double temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                   flag=true;
                }
            }
            if(!flag) return;
        }
    }
}
