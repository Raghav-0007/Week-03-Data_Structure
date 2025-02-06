package com.reading.stringbuffer.comparestringbufferwithstringbuilder;

public class CompareStringBufferwithStringBuilder {

    public static void appendString(StringBuffer sb){
        for(int i=0; i<1000000; i++){
            sb.append("hello");
        }
    }
    public static void appendString(StringBuilder sb){
        for(int i=0; i<1000000; i++){
            sb.append("hello");
        }
    }
}
