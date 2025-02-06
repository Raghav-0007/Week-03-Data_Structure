package com.searching.linearsearch.searchspecificword;

public class SearchSpecificWord {

    public static String searchSpecificWord(String[] arr, String word){
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals(word))
                return word+" is available";
        }
        return word+ " Not found";
    }
}
