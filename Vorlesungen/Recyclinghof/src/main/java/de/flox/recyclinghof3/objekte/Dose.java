package de.flox.recyclinghof3.objekte;

import de.flox.recyclinghof3.utils.Muell;

public class Dose extends Muell{

    public Dose(double gewicht) {
        super(gewicht);
    }

    public void einschmelzen(){
        System.out.println("einschmelzen");
    }
    public void printGewicht(){
        System.out.println("Gewicht: "+getGewicht());
    }

    @Override
    public void recycle() {
        System.out.println("Die Dose mit dem Gewicht "+getGewicht()+"kg wird eingeschmolzen");
    }
}
