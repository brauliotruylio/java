package org.example;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Insira o " + (i + 1) + "º: ");
            int num  = scanner.nextInt();

            if (num >= 10 && num <= 150) {
                count++;
            }
        }
        System.out.println("Quantidade de números dentro do intervalo é: " + count);

    }
}