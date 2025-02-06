package com.searching.linearsearch.searchspecificword;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};
        String word=SearchSpecificWord.searchSpecificWord(words, "dat");
        System.out.println(word);
    }
}
