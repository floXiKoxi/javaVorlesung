package de.flox.vorlesungen.main;

/*
    Klasse erstellt am 09.04.2021
    Florian Wilk
*/

import de.flox.vorlesungen.functions.HelloWorld;
import de.flox.vorlesungen.functions.MathClass;

public class Main {

    public static void main(String[] args){

        //Start functions from here

        //Hello World
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();

        HelloWorld helloWorld1 = new HelloWorld("Florian");
        helloWorld1.print();

        //Math class
        MathClass mathClass = new MathClass();
        System.out.println("Summe von 2 und 5: "+mathClass.addition(2, 5));
        System.out.println("Summe der nat Zahlen bis 100: "+mathClass.calcSum(100));
        System.out.println("Wurzel aus 2: "+mathClass.sqrt(2));
        System.out.println("Pruduct bis 100: "+mathClass.product(100));

    }

}
