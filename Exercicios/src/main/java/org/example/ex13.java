package org.example;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = scanner.nextInt();

        if (num > 10) {
            System.out.println("O número é maior que 10");
        } else {
            System.out.println("O número não é maior que 10");
        }


    }
}