package org.example.contadorDoWhile;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.println("1 x " + number + " = " + (number * 1));
            System.out.println("2 x " + number + " = " + (number * 2));
            System.out.println("3 x " + number + " = " + (number * 3));
            System.out.println("4 x " + number + " = " + (number * 4));
            System.out.println("5 x " + number + " = " + (number * 5));
            System.out.println("6 x " + number + " = " + (number * 6));
            System.out.println("7 x " + number + " = " + (number * 7));
            System.out.println("8 x " + number + " = " + (number * 8));
            System.out.println("9 x " + number + " = " + (number * 9));
            System.out.println("10 x " + number + " = " + (number * 10));

            number++;
        } while (number <= 10);
    }
}
