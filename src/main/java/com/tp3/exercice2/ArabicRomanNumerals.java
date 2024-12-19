package com.tp3.exercice2;

public class ArabicRomanNumerals {
    public static String convert(int nbr){
        String ch ="",ch1="",ch2="";
        String[] tab={"I","II","III","IV","V","VI","VII","VIII","IX"};
        int m = nbr%10;
        if(m!=0) ch =tab[m-1];
        return ch;
    }
}
