package com.sorting.insertionsort;

public class Main {
    public static void main(String[] args) {
        int[] ids={100, 101, 204, 302, 103, 512, 905, 224};
        SortEmployeeIDs.sortIds(ids);
        for(int id:ids){
            System.out.print(id+" ");
        }
    }
}
