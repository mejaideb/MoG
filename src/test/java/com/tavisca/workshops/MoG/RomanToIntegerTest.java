package com.tavisca.workshops.MoG;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {

    @Test
    public void romanToInteger() {
        RomanToInteger romanToInteger=new RomanToInteger();
        assertEquals(4, romanToInteger.convertRomanToInteger("IV"));
        assertEquals(1944, romanToInteger.convertRomanToInteger("MCMXLIV"));

    }
}
