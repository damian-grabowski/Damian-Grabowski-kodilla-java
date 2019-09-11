package com.kodilla;

class Calculator {

    double num1, num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2= num2;
    }

    public double add() {
        double result1 = num1 + num2;
        return result1;
    }

    public double substract() {
        double result2 = num1 - num2;
        return result2;
    }
}