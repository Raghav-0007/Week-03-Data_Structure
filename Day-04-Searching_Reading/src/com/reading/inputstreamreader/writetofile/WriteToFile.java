package com.reading.inputstreamreader.writetofile;

import java.io.*;

public class WriteToFile {

    // reading data from user input
    public static void readData(){
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            while (true){
                if(writeData(br.readLine())) break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // writing data into the file
    public static boolean writeData(String data){
        try{
            if(data.equals("exit")) return true;
            String filePath="src/com/reading/inputstreamreader/writetofile/file2.txt";
            FileWriter fw=new FileWriter(filePath, true);
            BufferedWriter bw=new BufferedWriter(fw);
            System.out.println(data);
            bw.write(data);
            bw.newLine();
            bw.flush();
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
