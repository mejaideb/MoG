package com.tavisca.workshops.MoG;

import java.util.HashMap;

public class CreditValueForMetal {
    MapValidator mapValidator;

    public CreditValueForMetal(MapValidator mapValidator) {
        this.mapValidator = mapValidator;
    }

    public static HashMap<String, Integer> metalCreditValueMap = new HashMap<>();

    public int getValueForMetals(String metal) {
        return getCreditValueForMetal(metalCreditValueMap.get(metal));

    }

    public static void storeCreditValueOfMetal(String statement) {
        CreditTokenParser creditTokenParser = new CreditTokenParser();
        RomanToInteger romanToInteger = new RomanToInteger();
        String[] metal = creditTokenParser.parseCreditStatement(statement);
        String creditValue = metal[metal.length - 1];
        String metalName = metal[metal.length - 2];
        String roman = "";
        for (int i = 0; i < metal.length - 2; i++) {
            roman = roman + MapValidator.galacticWordRomanMap.get(metal[i]);
        }
        int result = Integer.parseInt(creditValue) / romanToInteger.convertRomanToInteger(roman);
        metalCreditValueMap.put(metalName, result);
        getCreditValueForMetal(result);

    }

    private static int getCreditValueForMetal(int result) {
        return result;
    }
}
