package com.reading.filereader.countoccurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CountOccurrence {

    public static void countOccurrence(String word){
        int counter=0;
        String line;
        String filePath="src/com/reading/filereader/readafile/text.txt";
        try {
            FileReader fr=new FileReader(filePath);
            BufferedReader br=new BufferedReader(fr);
            while ((line= br.readLine())!=null){
                String[] words=line.split(" ");
                for (String s : words) {
                    if (s.equals(word))
                        counter++;
                }
            }
            System.out.println(counter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
