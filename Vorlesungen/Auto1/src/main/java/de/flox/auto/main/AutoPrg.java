package de.flox.auto.main;

import de.flox.auto.utils.Auto;

public class AutoPrg {

    private Auto[] autoArray = new Auto[5];

    public static void main(String[] args){

        Auto autoVW = new Auto("VW", "Golf", 1.83, "Weiß");
        autoVW.drucken();

        AutoPrg autoPrg = new AutoPrg();
        autoPrg.go();

    }
    void go(){

        fillArray();
        printAutoArray();
        printInstances();

    }
    void fillArray(){

        String[] herstellerArray = {"VW", "BMW", "Audi", "Opel", "Mercedes-Benz"};
        String[] typArray = {"Golf", "M3", "A5", "Corsa", "S-Klasse"};
        String[] farbArray = {"Weiß", "Blau", "Rot", "Grün", "Gelb"};
        double breite = 2.05;

        for(int i=0; i<5;i++){

            getAutoArray()[i] = new Auto(herstellerArray[i], typArray[i], breite, farbArray[i]);

        }
        System.out.println("Auto Array gefüllt");

    }
    void printAutoArray(){

        for(Auto auto : getAutoArray()){

            System.out.println("Hersteller: "+auto.getHersteller() + ", Typ: "+auto.getTyp() +
                    ", Raeder: "+auto.getRaeder()+ ", Breite: "+auto.getBreite() + ", Farbe: "+auto.getFarbe());

        }

    }
    void printInstances(){
        System.out.println("Instanzen erstellt: "+Auto.instances);
    }

    public Auto[] getAutoArray() {
        return autoArray;
    }
}
