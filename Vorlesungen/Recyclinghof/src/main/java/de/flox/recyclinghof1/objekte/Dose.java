package de.flox.recyclinghof1.objekte;

import de.flox.recyclinghof1.utils.Eigenschaften;

public class Dose extends Eigenschaften {

    public Dose(double gewicht){
        super(gewicht);
    }

    public void einschmelzen(){
        System.out.println("einschmelzen");
    }
    public void printGewicht(){
        System.out.println("Gewicht: "+getGewicht());
    }

}
