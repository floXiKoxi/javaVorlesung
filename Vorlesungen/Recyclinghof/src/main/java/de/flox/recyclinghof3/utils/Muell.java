package de.flox.recyclinghof3.utils;

public abstract class Muell implements Recyclebar{

    private double gewicht;

    public Muell(double gewicht){
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
}
