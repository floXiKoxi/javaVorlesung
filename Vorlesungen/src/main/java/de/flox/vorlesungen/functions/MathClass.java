package de.flox.vorlesungen.functions;

public class MathClass {

    public MathClass(){}

    public int addition(int x, int y){

        int xy = x+y;
        return xy;
    }
    //Fucntion calculates product from 1 to n
    public static long product(int n) {
        if (n == 0) {
            return 1;
        }
        return n * product(n - 1);
    }
    //Funktion Summe der natürlichen Zahlen
    public int calcSum(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            sum += i;
        }
        return sum;
    }
    public double sqrt(int n){

        if(n == 0){
            return 0;
        }
        double sqrtDouble = Math.sqrt(n);
        return sqrtDouble;
    }
}
