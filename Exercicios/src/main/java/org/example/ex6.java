package org.example;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Insira o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valor de A:" + A);
        System.out.println("Valor de B:" + B);

        int c = A;
        A = B;

        System.out.println("                ");
        System.out.println("----------------");
        System.out.println("                ");
        System.out.println("Valores trocados:");
        System.out.println("Valor de A:" + A);
        System.out.println("Valor de B:" + c);

    }
}