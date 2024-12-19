package com.tp3.exercice2;

public class ArabicRomanNumerals {
    public static String convert(int nbr){
        String ch ="",ch1="",ch2="";
        String[] tab={"I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tab1={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        int m = nbr%10;
        int x,y;
        if(m!=0) ch =tab[m-1];
        x=nbr/10;
        y=x%10;
        if(y!=0) ch1=tab1[y-1];
        return ch1+ch;
    }
}
