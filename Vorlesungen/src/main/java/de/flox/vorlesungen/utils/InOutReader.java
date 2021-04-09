package de.flox.vorlesungen.utils;

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
        try{
            getString = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return Double.valueOf(getString);
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
