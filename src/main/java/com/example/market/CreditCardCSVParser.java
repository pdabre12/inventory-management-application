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

public class CreditCardCSVParser implements InputCreditCardCSVParser {
    public CreditCardCSVParser(){};



    public static List<CreditCard> readCardsFromCSV(String fileName) {
        List<CreditCard> cards = new ArrayList<>();

        Path pathToFile = Paths.get(fileName);

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
                if(!rows.contains(("CardNumber"))) {
                    CreditCard card = createCard(attributes);

                    // adding book into ArrayList
                    cards.add(card);
                }
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return cards;
    }




    public static CreditCard createCard(String[] metadata){
        String cardNumber = metadata[0];

        return new CreditCard(cardNumber);
    }



}
