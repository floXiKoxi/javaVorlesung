package de.flox.auto.produkte;

public class Auto {

    static int raeder = 4;
    private String hersteller, typ, farbe;
    private double breite;
    public static int instances = 0;

    //Constructor
    public Auto(){
        instances++;
    }

    public Auto(String hersteller, String typ, double breite, String farbe){
        this.hersteller = hersteller;
        this.typ = typ;
        this.breite = breite;
        this.farbe = farbe;
        instances++;
    }

    public void drucken(){

        System.out.println("Hersteller: "+getHersteller()+"\n" +
                "Typ: "+getTyp()+"\n" +
                "Räder: "+getRaeder()+"\n" +
                "Breite: "+getBreite());

        lackiereAuto();
        lackiereAuto("rot");

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

