package com.reading.stringbuffer.concatenatestrings;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon",
                "mango", "nectarine", "orange", "papaya", "quince",
                "raspberry", "strawberry", "tangerine", "ugli", "watermelon"
        };
        StringBuffer sb=new StringBuffer();
        ConcatenateStrings.concatenateString(sb, words);
        System.out.println(sb);
    }
}
