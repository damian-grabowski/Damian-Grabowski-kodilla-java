package com.kodilla;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        int n1;
        int n2;
        int Answer;

        System.out.println("Enter the first number: ");
        n1 = Calc.nextInt();
        System.out.println("Enter the second number:" );
        n2 = Calc.nextInt();
        Calc.nextLine();
        System.out.println("Select the order of operation: ");
        char operator = Calc.nextLine().charAt(0);


        if (operator == '+') {
            Answer = (n1 + n2);
            System.out.println("Answer:" + Answer);
        }
        else if (operator == '-') {
            Answer = (n1 - n2);
            System.out.println("Answer:" + Answer);

        }
        else if (operator == '*') {
            Answer = (n1 * n2);
            System.out.println("Answer:" + Answer);
        }
        else if (operator == '/') {
            Answer = (n1/n2);
            System.out.println("Answer:" + Answer);
        }
        else {
            System.out.println("not implemented yet. Sorry!");
        }


    }

}
