package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        System.out.println("Test - pierwszy test jednostkowy ");

        Calculator calculator = new Calculator(5, 10);

        double result1 = calculator.add();
        if (result1 == 15) {
            System.out.println("a = 5, b = 10");
        } else {
            System.out.println("Error");
        }

        double result2 = calculator.substract();
        if (result2 == -5) {
            System.out.println("a = 5, b = 10");
        } else {
            System.out.println("Error");
        }

    }
}
