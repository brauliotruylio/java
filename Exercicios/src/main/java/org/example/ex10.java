package org.example;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double produto = scanner.nextDouble();

        double prestacao = produto / 5;

        System.out.println("O valor da prestação é de R$ " + prestacao);


    }
}