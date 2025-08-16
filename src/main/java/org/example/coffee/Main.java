package org.example.coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tamanhCoffe = "";
        String tipoDoCafe = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tamanho de café P = 1, M = 2, G = 3");
        int tamanhoDoCafe = scanner.nextInt();

        System.out.println("Tipo de Café");
        System.out.println("Tipo de Café: Expresso = 1, Bourbon = 2, Icatu = 3");
        int tipoDoCafeEscolha = scanner.nextInt();

        switch (tamanhoDoCafe) {
            case 1:
                System.out.println("Tamanho P");
                tamanhCoffe = "P";
                break;
            case 2:
                System.out.println("Tamanho M");
                tamanhCoffe = "M";
                break;
            case 3:
                System.out.println("Tamanho G");
                tamanhCoffe = "G";
                break;
            default:
                System.out.println("Tamanho não encontrado...");
        }

        switch (tipoDoCafeEscolha) {
            case 1:
                System.out.println("Expresso");
                tipoDoCafe = "Expresso";
                break;
            case 2:
                System.out.println("Bourbon");
                tipoDoCafe = "Bourbon";
                break;
            case 3:
                System.out.println("Icatu");
                tipoDoCafe = "Icatu";
                break;
            default:
                System.out.println("Tipo de café não encontrado...");
        }

        System.out.println("Seu pedido é: ");
        System.out.println(tamanhCoffe);
        System.out.println(tipoDoCafe);

        scanner.close();


    }
}
