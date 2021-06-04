package de.flox.auto.produkte;

public class Auto {

    private static int raeder = 4;
    private String hersteller, typ;
    private Farbe farbe;
    private double breite;
    public static int instances = 0;

    //Constructor
    public Auto(){
        instances++;
    }

    public Auto(String hersteller, String typ, double breite, Farbe farbe){
        this.hersteller = hersteller;
        this.typ = typ;
        this.breite = breite;
        this.farbe = farbe;
        instances++;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }

        final Auto b = (Auto) obj;

        if(hersteller.equals(b.getHersteller()) && typ.equals(b.getTyp())){
            return true;
        }
        if(Double.compare(b.breite, breite) != 0){
            return false;
        }
        return false;
    }

    public void drucken(){

        System.out.println("Hersteller: "+getHersteller()+"\n" +
                "Typ: "+getTyp()+"\n" +
                "Räder: "+getRaeder()+"\n" +
                "Breite: "+getBreite()+"\n" +
                "Farbe: "+getFarbe().toString());

        lackiereAuto();

    }

    //Methods
    public void lackiereAuto(){
        lackiereAuto(Farbe.SCHWARZ);
    }
    public void lackiereAuto(Farbe neueFarbe){
        setFarbe(neueFarbe);
        System.out.println("Das Auto wurde "+getFarbe()+" lackiert");
    }
    public void fahren(){

        System.out.println("Das Auto fährt. Brumm brumm..");

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

    public void setFarbe(Farbe farbe) {
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

    public Farbe getFarbe() {
        return farbe;
    }
}

