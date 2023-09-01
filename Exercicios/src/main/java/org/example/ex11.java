package org.example;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo do produto: ");
        double custo = scanner.nextDouble();

        System.out.println("Informe a margem de lucro do produto: ");
        double percentualLucro = scanner.nextDouble();

        double valorVenda = custo + (custo * percentualLucro)/100;

        System.out.println("Preço de venda: R$ " + valorVenda);
    }
}