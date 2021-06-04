package de.flox.recyclinghof1.objekte;

import de.flox.recyclinghof1.utils.Eigenschaften;

public class Karton extends Eigenschaften {

    public Karton(double gewicht){
        super(gewicht);
    }
    public void einweichen(){
        System.out.println("einweichen");
    }
    public void printGewicht(){
        System.out.println("Gewicht: "+getGewicht());
    }

}
