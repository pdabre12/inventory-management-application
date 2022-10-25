package com.example.market;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InputItemCSVParser implements ItemInputCSVParser{


    public InputItemCSVParser(){

    }

    public  static List<Item> InputFileParser(String file){

        Path pathToFile = Paths.get(file);
        List<Item> OrderItems = new ArrayList<>();


        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {


                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                List<String> rows= Arrays.asList(attributes);
                if(!rows.contains(("Item"))) {
                    Item orderItem = createItem(attributes);

                    // adding book into ArrayList
                    OrderItems.add(orderItem);
                }
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
//
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return OrderItems;



    }





    public static Item createItem(String[] metadata) {
        String item = metadata[0];

        int quantity = Integer.parseInt(metadata[1]);
        return new Item(item, quantity);
    }



}
