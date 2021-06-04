package de.flox.recyclinghof2.utils;

public abstract class Muell {

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
    public abstract void recycle();
}
