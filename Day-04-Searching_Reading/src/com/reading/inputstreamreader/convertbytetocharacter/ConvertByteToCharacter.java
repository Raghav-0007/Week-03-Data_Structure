package com.reading.inputstreamreader.convertbytetocharacter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ConvertByteToCharacter {
    public static void converStream(){
        String filePath="src/com/reading/inputstreamreader/convertbytetocharacter/file2.txt";
        try{
            FileInputStream fis=new FileInputStream(filePath);
            InputStreamReader isr=new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br=new BufferedReader(isr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
