package de.flox.auto.utils;

public class Auto {

    private int raeder;
    private String hersteller, typ, farbe;
    private double breite;

    //Constructor
    public Auto(){ }

    public Auto(String hersteller, String typ, int raeder, double breite){
        setHersteller(hersteller);
        setBreite(breite);
        setTyp(typ);
        setRaeder(raeder);
    }

    public void drucken(Auto auto){

        System.out.println("Hersteller: "+auto.getHersteller()+"\n" +
                "Typ: "+auto.getTyp()+"\n" +
                "Räder: "+auto.getRaeder()+"\n" +
                "Breite: "+auto.getBreite());

        auto.lackiereAuto();
        auto.lackiereAuto("rot");

    }

    //Methods
    public void lackiereAuto(){
        lackiereAuto("schwarz");
    }
    public void lackiereAuto(String neueFarbe){
        setFarbe(neueFarbe);
        System.out.println("Das Auto wurde "+getFarbe()+" lackiert");
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

    public void setFarbe(String farbe) {
        this.farbe = farbe;
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

    public String getFarbe() {
        return farbe;
    }
}

