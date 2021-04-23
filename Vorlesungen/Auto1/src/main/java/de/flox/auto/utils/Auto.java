package de.flox.auto.utils;

public class Auto {

    private int raeder;
    private String hersteller, typ;
    private double breite;

    //Constructor
    public Auto(){ }

    public Auto(String hersteller, String typ, int raeder, double breite){
        setHersteller(hersteller);
        setBreite(breite);
        setTyp(typ);
        setRaeder(raeder);
    }

    //Setter
    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setRaeder(int raeder) {
        this.raeder = raeder;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    //Getter
    public double getBreite() {
        return breite;
    }

    public int getRaeder() {
        return raeder;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getTyp() {
        return typ;
    }
}

