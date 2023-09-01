package org.example;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de depósito: ");
        double deposito = scanner.nextDouble();

        double juros = 0.07;

        double rendimentosMes = deposito + (deposito * juros);

        System.out.println("O valor com o rendimento do mês é " + rendimentosMes);

    }
}