package com.problemstatement.largefilereading;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReadingComparison f=new FileReadingComparison();
        String filePath = "largefile.txt"; // Test file path

        long fileReaderTime = f.fileReaderRead(filePath);
        long inputStreamReaderTime = f.inputStreamReaderRead(filePath);

        System.out.println("File Size: 500MB");
        System.out.println("FileReader Time: " + (fileReaderTime / 1e9) + " s");
        System.out.println("InputStreamReader Time: " + (inputStreamReaderTime / 1e9) + " s");
    }
}

