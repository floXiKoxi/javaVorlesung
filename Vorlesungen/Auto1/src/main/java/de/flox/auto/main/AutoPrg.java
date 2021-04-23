package de.flox.auto.main;

import de.flox.auto.utils.Auto;

public class AutoPrg {

    private Auto[] autoArray = new Auto[5];

    public static void main(String[] args){

        Auto autoVW = new Auto("VW", "Golf", 4, 1.83);
        autoVW.drucken(autoVW);

        AutoPrg autoPrg = new AutoPrg();
        autoPrg.fillArray();
        autoPrg.printAutoArray();

    }
    private void fillArray(){

        String[] herstellerArray = {"VW", "BMW", "Audi", "Opel", "Mercedes-Benz"};
        String[] typArray = {"Golf", "1er", "A5", "Corsa", "S-Klasse"};
        int raeder = 4;
        double breite = 2.05;

        for(int i=0; i<5;i++){

            String hersteller = herstellerArray[i];
            String typ = typArray[i];
            getAutoArray()[i] = new Auto(hersteller, typ, raeder, breite);

        }
        System.out.println("Auto Array gefüllt");

    }
    private void printAutoArray(){

        for(Auto auto : getAutoArray()){

            System.out.println("Hersteller: "+auto.getHersteller() + ", Typ: "+auto.getTyp() + ", Raeder: "+auto.getRaeder()+ ", Breite: "+auto.getBreite());

        }

    }

    public Auto[] getAutoArray() {
        return autoArray;
    }
}
