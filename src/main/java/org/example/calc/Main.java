package org.example.calc;

public class Main {
    public static void main(String[] args) {

        int number01 = 3;
        int number02 = 3;
        int number = 4;

        switch (number) {
            case 1:
                System.out.println("SOMA");
                var som = number01 + number02;
                System.out.println(som);
                break;
            case 2:
                System.out.println("SUBTRACAO");
                var sub = number01 - number02;
                System.out.println(sub);
                break;
            case 3:
                System.out.println("MULTIPLICACAO");
                var mult = number01 * number02;
                System.out.println(mult);
                break;
            case 4:
                System.out.println("DIVISAO");
                var div = number01 / number02;
                System.out.println(div);
                break;
            default:
                System.out.println("operacao invalida");
        }



    }
}
