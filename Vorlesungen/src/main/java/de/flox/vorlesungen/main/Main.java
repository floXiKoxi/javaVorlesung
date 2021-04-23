package de.flox.vorlesungen.main;

import de.flox.vorlesungen.functions.MathClass;
import de.flox.vorlesungen.utils.InOutReader;

public class Main {

    public static void main(String[] args){

        //Math class
        MathClass mathClass = new MathClass();

        //Console Input
        InOutReader inOutReader = new InOutReader();

        //Rechner exercise
        questionMath(inOutReader, mathClass);


    }
    public static void questionMath(InOutReader inOutReader, MathClass mathClass){
        boolean run = true;

        while(run == true){

            System.out.print("Gib die erste Zahl ein: ");
            double x = inOutReader.getDouble();

            System.out.print("Gib die zweite Zahl ein: ");
            double y = inOutReader.getDouble();

            System.out.println("Was willst du nun tun ?\n" +
                    "a) Zwei Zahlen addieren ?\n" +
                    "b) Subtrahieren von 2 Zahlen?\n" +
                    "c) Multiplizieren von 2 Zahlen?\n" +
                    "d) Dividieren von 2 Zahlen?\n" +
                    "x) Prozess abbrechen");
            System.out.print("Gib ein was du machen willst (z.b. a, b, c oder d): ");
            String select = inOutReader.getString();

            switch (select){
                case "a":
                    System.out.println("Summe von "+x+" und "+y+": "+mathClass.addition(x, y));
                    break;

                case "b":
                    System.out.println("Subtraktion von "+x+" und "+y+": "+mathClass.subtrahieren(x, y));
                    break;

                case "c":

                    System.out.println("Multiplikation von "+x+" und "+y+": "+mathClass.multiplikation(x, y));
                    break;

                case "d":

                    if(y == 0){
                        while(y == 0){
                            System.out.print("Gib die zweite Zahl ein die größer als 0 ist: ");
                            y = inOutReader.getDouble();
                        }
                    }

                    System.out.println("Division von "+x+" und "+y+": "+mathClass.division(x, y));
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
