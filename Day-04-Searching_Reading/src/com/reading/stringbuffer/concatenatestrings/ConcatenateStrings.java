package com.reading.stringbuffer.concatenatestrings;

public class ConcatenateStrings {

    public static void concatenateString(StringBuffer sb, String[] arr){
        for(String str:arr){
            sb.append(str);
        }
    }
}
