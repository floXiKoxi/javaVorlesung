package de.flox.calc.main;

import de.flox.calc.utils.Calculator;

public class CalculatorCallback {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.calculate(5, 17, Calculator.Operation.MUL, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 mal 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.DIV, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 durch 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.PLUS, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 plus 17 is: " + result);
            }
        });
        calc.calculate(5, 17, Calculator.Operation.MINUS, new ResultCallback() {
            @Override
            public void showResult(double result) {
                System.out.println("5 minus 17 is: " + result);
            }
        });
    }

    public interface ResultCallback {
        void showResult(double result);
    }
}