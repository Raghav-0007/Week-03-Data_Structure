package com.reading.inputstreamreader.challengeproblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class ChallengeProblem {

    public static void challangeProblem(){
        String filePath="src/com/reading/inputstreamreader/challengeproblem/file2.txt";
        try{
            FileReader fr=new FileReader(filePath);
            StringBuilder sb=new StringBuilder();
            int i;
            while ((i=fr.read())!=-1){
                sb.append((char) i);
            }
            String[] words=sb.toString().split("[\\s\\r\\n]+");
            System.out.println(words.length);
            System.out.println(Arrays.toString(words));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
