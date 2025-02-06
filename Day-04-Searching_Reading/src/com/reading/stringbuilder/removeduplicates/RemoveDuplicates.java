package com.reading.stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicate(String str){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(hs.contains(ch)){
                continue;
            }
            hs.add(ch);
            sb.append(ch);
        }
        return sb.toString();
    }
}
