package org.example;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("O número está entre 100 e 200");
        } else {
            System.out.println("O número não está.");
        }

    }
}