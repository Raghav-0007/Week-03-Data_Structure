package com.reading.filereader.readafile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public static void readFile(){
        String filePath="src/com/reading/filereader/readafile/text.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
