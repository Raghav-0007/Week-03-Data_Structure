package com.reading.stringbuffer.comparestringbufferwithstringbuilder;

public class Main {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();

        long before=System.nanoTime();
        CompareStringBufferwithStringBuilder.appendString(stringBuffer);
        long after=System.nanoTime();
        long time=(after-before);
        System.out.println("time taken by StringBuffer:  "+time);

        before=System.nanoTime();
        CompareStringBufferwithStringBuilder.appendString(stringBuilder);
        after=System.nanoTime();
        time=(after-before);
        System.out.println("time taken by StringBuilder: "+time);
    }
}
