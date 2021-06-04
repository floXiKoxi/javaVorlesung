package de.flox.sort.main;

import de.flox.sort.produkte.Auto;
import de.flox.sort.produkte.AutoComparator;

import java.util.*;

public class SortCollections {

    private List<Auto> autoList = new ArrayList<>();

    //public void add(Auto auto)
    //autoList.add(new Auto())

    public static void main(String[] args) {

        SortCollections autoCollections = new SortCollections();
        autoCollections.fillList();
        autoCollections.printAutos(autoCollections.getAutoList());

        //autoCollections.sortList();
        autoCollections.sortListBreite();
        autoCollections.printAutos(autoCollections.getAutoList());

    }

    public void fillList(){

        String[] hersteller = {"Chevrolet", "Audi", "BMW" , "Mercedes-Benz", "Porsche"};
        String[] modell = {"Camaro ZL1", "RS7", "M4", "GT63S", "991.2 GT3"};
        double[] breite = {1.99, 2.10, 2.15, 1.85, 1.95};
        Auto.Farbe[] farben = {Auto.Farbe.SCHWARZ, Auto.Farbe.GELB, Auto.Farbe.ROT, Auto.Farbe.WEISS, Auto.Farbe.WEISS};

        for(int i=0; i< hersteller.length; i++){

            autoList.add(new Auto(hersteller[i], modell[i], breite[i], farben[i]));

        }

    }
    public void printAutos(List<Auto> autos){

        for(Auto auto : autos){

            System.out.println(auto.toString());

        }

    }
    public void sortList(){

        //getAutoList().sort(Auto::compareTo);

        Collections.sort(getAutoList(), new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.compareTo(o2);
            }
        });

    }
    public void sortListBreite(){

        //getAutoList().sort(Auto::compareTo);

        Collections.sort(getAutoList(), new AutoComparator());

    }

    public List<Auto> getAutoList() {
        return autoList;
    }

}
