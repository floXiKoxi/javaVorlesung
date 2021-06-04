package de.flox.collections.utils;

import de.flox.collections.produkte.Auto;

import java.util.ArrayList;
import java.util.List;

public class FahrzeugManager<F extends Auto> {

    List<F> autoArrayList = new ArrayList<>();

    public FahrzeugManager(){}

    public void add(F auto){
        autoArrayList.add(auto);
    }

    public Auto get(int index){
        return autoArrayList.get(index);
    }
    public void lackiereAuto(Auto.Farbe farbe){

        for(F auto : autoArrayList){
            auto.lackiereAuto(Auto.Farbe.SCHWARZ);
        }

    }

}
