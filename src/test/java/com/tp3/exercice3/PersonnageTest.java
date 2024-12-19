package com.tp3.exercice3;

import com.tp3.exercice1.Personnage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    @Test
    void tourn_test(){
        Personnage P= new Personnage();
        String result=P.tourner(0);
        assertEquals("NORD",result,"we be "+"NORD"+" but we "+result);
    }
}
