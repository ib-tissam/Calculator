package com.tp3.exercice2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralTest {
    @Test
    void convert_test0(){
        ArabicRomanNumerals A=new ArabicRomanNumerals();
        String result=A.convert(0);
        assertEquals("NULL",result,"we be "+"NULL"+" but we be "+result);
    }
    @Test
    void convert_test1(){
        ArabicRomanNumerals A=new ArabicRomanNumerals();
        String result=A.convert(1);
        assertEquals("I",result,"we be "+"I"+" but we be "+result);
    }
    @Test
    void convert_test2(){
        ArabicRomanNumerals A=new ArabicRomanNumerals();
        String result=A.convert(5);
        assertEquals("V",result,"we be "+"V"+" but we be "+result);
    }
    @Test
    void convert_test3(){
        ArabicRomanNumerals A=new ArabicRomanNumerals();
        String result=A.convert(10);
        assertEquals("X",result,"we be "+"X"+" but we be "+result);
    }
}
