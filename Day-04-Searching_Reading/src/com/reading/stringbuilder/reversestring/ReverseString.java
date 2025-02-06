package com.reading.stringbuilder.reversestring;

public class ReverseString {

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
