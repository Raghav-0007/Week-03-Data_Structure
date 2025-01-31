package com.sorting.bubblesort;

public class Main {
    public static void main(String[] args) {
        // marks of students
        double[] marks={40, 50, 95, 85.6, 94, 33.3, 67, 45.5};

        // sort the marks
        SortStudentMarks.sortMarks(marks);

        // print marks
        for(double mark: marks){
            System.out.print(mark+" ");
        }
    }
}
