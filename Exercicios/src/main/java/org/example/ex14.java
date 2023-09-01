package org.example;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2);
        } else if (num1 < num2){
            System.out.println("O número " + num1 + " é menor que " + num2);
        } else {
            System.out.println("números iguais");
        }


    }
}