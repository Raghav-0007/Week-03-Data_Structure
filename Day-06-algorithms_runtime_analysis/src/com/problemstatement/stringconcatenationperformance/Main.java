package com.problemstatement.stringconcatenationperformance;

public class Main {
    public static void main(String[] args) {
        StringConcatenationPerformance s=new StringConcatenationPerformance();
        long before=System.nanoTime();
        s.concateStringBuilder(10_000_00);
        long after=System.nanoTime();
        System.out.println((after-before)/1e+9);

        before=System.nanoTime();
        s.concateStringBuffer(10_000_00);
        after=System.nanoTime();
        System.out.println((after-before)/1e+9);

        before=System.nanoTime();
        s.concateString(10_000_00);
        after=System.nanoTime();
        System.out.println((after-before)/1e+9);
    }
}
