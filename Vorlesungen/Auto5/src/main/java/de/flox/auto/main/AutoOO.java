package de.flox.auto.main;

import de.flox.auto.produkte.Auto;
import de.flox.auto.produkte.Cabrio;
import de.flox.auto.produkte.Farbe;

public class AutoOO {

    private Auto[] autoArray = new Auto[5];

    public static void main(String[] args){

        Auto autoVW = new Auto("VW", "Golf", 1.83, Farbe.WEISS);
        autoVW.drucken();

        AutoOO autoPrg = new AutoOO();
        //autoPrg.go();
        autoPrg.cabrioMethod();

    }


    public void cabrioMethod(){

        Cabrio cabrio = new Cabrio("BMW", "3er", 2.03, Farbe.BLAU);
        cabrio.fahren();

    }
    public void go(){

        Auto a = new Auto("VW", "Golf", 1.83, Farbe.WEISS);

        fillArray();
        printAutoArray();
        printInstances();

        a.fahren();

    }
    public void fillArray(){

        String[] herstellerArray = {"VW", "BMW", "Audi", "Opel", "Mercedes-Benz"};
        String[] typArray = {"Golf", "M3", "A5", "Corsa", "S-Klasse"};
        Farbe[] farbArray = {Farbe.WEISS, Farbe.SCHWARZ, Farbe.ROT, Farbe.BLAU, Farbe.GELB};
        double breite = 2.05;

        for(int i=0; i<5;i++){

            getAutoArray()[i] = new Auto(herstellerArray[i], typArray[i], breite, farbArray[i]);

        }
        System.out.println("Auto Array gefüllt");

    }
    public void printAutoArray(){

        for(Auto auto : getAutoArray()){

            System.out.println("Hersteller: "+auto.getHersteller() + ", Typ: "+auto.getTyp() +
                    ", Raeder: "+auto.getRaeder()+ ", Breite: "+auto.getBreite() + ", Farbe: "+auto.getFarbe());

        }

    }
    public void printInstances(){
        System.out.println("Instanzen erstellt: "+Auto.instances);
    }

    public Auto[] getAutoArray() {
        return autoArray;
    }
}
