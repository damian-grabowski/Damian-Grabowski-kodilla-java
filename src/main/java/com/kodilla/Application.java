package com.kodilla;

class Application {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator(5, 10);

        double result1 = calc1.add();
        double result2 = calc1.substract();

        System.out.println("Substraction result: " + result2);
        System.out.println("Addition result: " + result1);
    }
}

