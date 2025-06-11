package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calc=new StringCalculator();
    @Test
    public void NewlineAsSeparator(){
        assertEquals("Number expected but '\n' found at position 6.",calc.add("175.2,\n35"));
    }
    @Test
    public void MissingNumberInLastPosition(){
        assertEquals("Number expected but EOF found.",calc.add("1,3,"));
    }
    @Test
    public void CustomSeparators(){
        assertEquals("'|' expected but ',' found at position 3.",calc.add("//|\n1|2,3"));
    }
    @Test
    public void NegativeNumbers(){
        assertEquals("Negative not allowed : -4, -5",calc.add("2,-4,-5"));
    }
    @Test
    public void MultipleErrors(){
        assertEquals("Negative not allowed : -1\nNumber expected but ',' found at position 3.\nNegative not allowed : -2",calc.add("-1,,2"));
    }

}