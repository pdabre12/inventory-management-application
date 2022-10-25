package com.example.market;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ErrorFile implements OutputFile{
    public ErrorFile(){};


    public void write(String path, int data,String item) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.write("Please correct quantities of the following items:\n");
        writer.write(String.valueOf(data));
        writer.write("\n");
        writer.write(String.valueOf(item));

        writer.flush();
        writer.close();
        System.out.println("Error File generated at :"+path);
    }
}


