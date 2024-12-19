package com.tp3.exercice1;

public class Personnage {
    public static String tourner(int nbr){
        String ch="NORD";
        if(nbr%4==1){
            ch="EST";
            return ch;
        }
        else if(nbr%4==2){
            ch="SUD";
            return ch;
        }
        return ch;
    }
}
