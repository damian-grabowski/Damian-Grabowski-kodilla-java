package com.kodilla.testing.calculator;

public class Calculator {
    double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        double result1 = a + b;
        return result1;
    }

    public double substract() {
        double result2 = a - b;
        return result2;
    }
}

