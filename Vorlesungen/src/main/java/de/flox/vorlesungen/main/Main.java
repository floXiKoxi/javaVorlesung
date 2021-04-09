package de.flox.vorlesungen.main;

/*
    Klasse erstellt am 09.04.2021
    Florian Wilk
*/

import de.flox.vorlesungen.functions.HelloWorld;
import de.flox.vorlesungen.functions.MathClass;
import de.flox.vorlesungen.utils.InOutReader;

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
        System.out.println("Pythagoras aus A=2 und B=9. C = "+mathClass.pythagoras(2, 9));

        //Console Input
        InOutReader inOutReader = new InOutReader();

        //Get Name of User
        System.out.print("Gib deinen Namen ein: ");
        String name = inOutReader.getString();

        //Get Age of User
        System.out.print("Gib dein Alter ein: ");
        int age = inOutReader.getInt();

        //Return all Info
        System.out.println("Hallo "+name+": \n" +
                "Alter: "+age);

        //Extra exercise

        questionMath(inOutReader, mathClass);


    }
    public static void questionMath(InOutReader inOutReader, MathClass mathClass){
        boolean run = true;

        while(run == true){

            System.out.println("Was willst du nun tun ?\n" +
                    "a) Zwei Zahlen addieren ?\n" +
                    "b) Summe aller Zahlen bis n ?\n" +
                    "c) Wurzel berechnen ?\n" +
                    "d) Produkt bis n ausrechnen?\n" +
                    "x) Prozess abbrechen");
            System.out.print("Gib ein was du machen willst (z.b. a, b, c oder d): ");
            String select = inOutReader.getString();

            switch (select){
                case "a":
                    System.out.print("Gib die erste Zahl ein: ");
                    double x = inOutReader.getDouble();
                    System.out.print("Gib die zweite Zahl ein: ");
                    double y = inOutReader.getDouble();
                    System.out.println("Summe von "+x+" und "+y+": "+mathClass.addition(x, y));
                    break;
                case "b":
                    System.out.print("Die Gib eine ganze Zahl ein: ");
                    int n = inOutReader.getInt();
                    System.out.println("Summe aller Zahlen bis "+n+": "+mathClass.calcSum(n));
                    break;
                case "x":
                    run = false;
                    break;
                default:
                    break;
            }

        }

    }

}
