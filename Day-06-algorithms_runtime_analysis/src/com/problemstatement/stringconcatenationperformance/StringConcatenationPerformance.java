package com.problemstatement.stringconcatenationperformance;

public class StringConcatenationPerformance {

    // concatenating string using string buffer
    public void concateStringBuffer(int size){
        StringBuffer sb=new StringBuffer();
        for(int i=0; i<size; i++){
            sb.append("hello");
        }
    }

    // concatenating string using string builder
    public void concateStringBuilder(int size){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<size; i++){
            sb.append("hello");
        }
    }

    // concatenating using string using string
    public void concateString(int size){
        String str="ff";
        for(int i=0; i<size; i++){
            str=str.concat("hello");
            char ch=str.charAt(1);
            
        }
    }

}
