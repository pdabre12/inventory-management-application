package com.example.market;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputCSVFile implements OutputFile {
    public OutputCSVFile() {
    }

    ;

    public void write(String path, double data) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.write("Amt paid:\n");
        writer.write(String.valueOf(data));
        writer.flush();
        writer.close();
        System.out.println("File generated at :" + path);
    }
}
