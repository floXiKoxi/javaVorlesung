package de.flox.auto.main;

import de.flox.auto.utils.Auto;

public class AutoOO {

    private Auto[] autoArray = new Auto[5];

    public static void main(String[] args){

        Auto autoVW = new Auto("VW", "Golf", 1.83, "Weiß");
        autoVW.drucken();

        AutoOO autoPrg = new AutoOO();
        autoPrg.go();

    }
    void swap(Auto a, Auto b){

        Auto t;
        t = a;
        a = b;
        b = t;
        System.out.println("Auto a=b: "+a.getHersteller());
        System.out.println("Auto b=a: "+b.getHersteller());
    }
    void go(){

        Auto a = new Auto("VW", "Golf", 1.83, "Weiß");
        Auto b = new Auto("BMW", "M3", 1.83, "Weiß");

        System.out.println("Test: "+a.equals(b));

        fillArray();
        printAutoArray();
        printInstances();

        System.out.println("===================================");
        System.out.println("Hersteller: "+a.getHersteller() + ", Typ: "+a.getTyp() +
                ", Raeder: "+a.getRaeder()+ ", Breite: "+a.getBreite() + ", Farbe: "+a.getFarbe());
        System.out.println("Hersteller: "+b.getHersteller() + ", Typ: "+b.getTyp() +
                ", Raeder: "+b.getRaeder()+ ", Breite: "+b.getBreite() + ", Farbe: "+b.getFarbe());
        swap(a, b);

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
