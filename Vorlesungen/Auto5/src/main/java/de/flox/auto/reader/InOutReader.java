package de.flox.auto.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOutReader {

    /*
    Diese Klasse liest den Konsolen Input aus und gibt ihn als den jenigen Datentyp wieder zurück
    */

    public InOutReader(){}

    public String getString(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getString = "";
        try{
            getString = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return  getString;
    }
    public double getDouble(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getString = "";
        double result = 0;
        try{
            getString = reader.readLine();

        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            result = Double.parseDouble(getString);  // convert it to double
        }
        catch (NumberFormatException nfe) {
            System.out.println("Fehler: Bitte eine valide Zahl eingeben" + nfe.toString());
            System.out.print("\nBitte gib eine Zahl ein! ");
            return getDouble();
        }

        return result;
    }
    public int getInt(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getString = "";
        try{
            getString = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return  Integer.valueOf(getString);

    }

}
