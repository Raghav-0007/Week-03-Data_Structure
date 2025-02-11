package com.problemstatement.largefilereading;

import java.io.*;

public class FileReadingComparison {

    // FileReader Implementation (Character Stream)
    public long fileReaderRead(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        long start = System.nanoTime();
        while (fileReader.read() != -1) {
            // Read character by character
        }
        fileReader.close();
        return System.nanoTime() - start;
    }

    // InputStreamReader Implementation (Byte Stream)
    public long inputStreamReaderRead(String filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        long start = System.nanoTime();
        while (inputStreamReader.read() != -1) {
            // Read byte by byte and convert to character
        }
        inputStreamReader.close();
        return System.nanoTime() - start;
    }
}
