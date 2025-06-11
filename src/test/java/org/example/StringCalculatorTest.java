package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calc=new StringCalculator();
    @Test
    public void NewlineAsSeparator(){
        assertEquals("Number expected but '\n' found at position 6.",calc.add("175.2,\n35"));
    }

}