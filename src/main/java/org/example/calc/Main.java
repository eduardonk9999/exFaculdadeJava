package org.example.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPERACOES 1 = +, 2 = -, 3 = *, 4 = /");
        int escolharOperacao = scanner.nextInt();

        System.out.println("Digite o primeiro valor da operacao");
        int number01 = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        int number02 = scanner.nextInt();

        int number = escolharOperacao;

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

        scanner.close();


    }
}
