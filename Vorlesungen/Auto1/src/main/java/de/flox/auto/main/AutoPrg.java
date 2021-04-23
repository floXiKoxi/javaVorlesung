package de.flox.auto.main;

import de.flox.auto.utils.Auto;

public class AutoPrg {

    public static void main(String[] args){

        Auto autoVW = new Auto("VW", "Golf", 4, 1.83);

        System.out.println("Hersteller: "+autoVW.getHersteller()+"\n" +
                "Typ: "+autoVW.getTyp()+"\n" +
                "Räder: "+autoVW.getRaeder()+"\n" +
                "Breite: "+autoVW.getBreite());

    }

}
