package com.tp3.exercice1;

public class Personnage {
    public static String tourner(int nbr){
        String ch="NORD";
        if(nbr%4==1){
            ch="EST";
            return ch;
        }
        return ch;
    }
}
