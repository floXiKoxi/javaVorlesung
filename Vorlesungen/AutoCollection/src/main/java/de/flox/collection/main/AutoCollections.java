package de.flox.collection.main;

import de.flox.collection.produkte.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoCollections {

    private List<Auto> autoList = new ArrayList<>();

    public static void main(String[] args) {

        AutoCollections autoCollections = new AutoCollections();
        autoCollections.fillList();
        autoCollections.printAutos();


    }
    public void fillList(){

        String[] hersteller = {"Audi", "BMW", "Chevrolet", "Mercedes-Benz", "Porsche"};
        String[] modell = {"RS7", "M4", "Camaro ZL1", "GT63S", "991.2 GT3"};
        Auto.Farbe[] farben = {Auto.Farbe.SCHWARZ, Auto.Farbe.GELB, Auto.Farbe.ROT, Auto.Farbe.WEISS, Auto.Farbe.WEISS};

        for(int i=0; i< hersteller.length; i++){

            autoList.add(new Auto(hersteller[i], modell[i], 2.01, farben[i]));

        }

    }
    public void printAutos(){

        for(Auto auto : getAutoList()){

            System.out.println(auto.toString());

        }

    }

    public List<Auto> getAutoList() {
        return autoList;
    }

}
