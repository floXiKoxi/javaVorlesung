package de.flox.auto.produkte;

public class Cabrio extends Auto{

    public Cabrio(String hersteller, String typ, double breite, Farbe farbe){
        super(hersteller, typ, breite, farbe);
        instances++;
    }
    @Override
    public void fahren(){
        System.out.println("Das Cabrio fährt... Brumm Brumm. Aber mit offenem Verdeck");
    }

}
