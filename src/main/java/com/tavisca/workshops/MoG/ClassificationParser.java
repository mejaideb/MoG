package com.tavisca.workshops.MoG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassificationParser {


    public static void main(String[] args) {

        MerchantGalaxy merchantGalaxy = new MerchantGalaxy();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\jmandal\\Desktop\\taviscaday1\\MerchantOfGalaxy\\src\\main\\java\\com\\tavisca\\workshops\\MoG\\InputFile"));
            String input = reader.readLine();
            while (input != null) {
                if (input.endsWith("I") || input.endsWith("V") || input.endsWith("X") || input.endsWith("C") || input.endsWith("L") || input.endsWith("D") || input.endsWith("M")) {

                    MapValidator.storeRomanOfGalacticWordInMap(input);
                    input = reader.readLine();
                    continue;
                }
                else if (input.endsWith("Credits")) {
                    CreditValueForMetal.storeCreditValueOfMetal(input);
                    input = reader.readLine();
                    continue;
                }
                else if (input.startsWith("how much is") && input.endsWith("?")) {
                    System.out.println(merchantGalaxy.handleQueries(input));
                }
                else if (input.startsWith("how many Credits is") && input.endsWith("?")) {
                    System.out.println(merchantGalaxy.handleQueries(input));
                } else {
                    System.out.println("I have no idea what you are talking about");
                }
                input = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
