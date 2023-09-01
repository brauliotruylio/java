package org.example;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double percentualComissao = 0.15;

        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo deste vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas deste vendedor no último mês: ");
        double totalVendas = scanner.nextDouble();

        double salarioTotal = totalVendas * percentualComissao + salarioFixo;

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: " + salarioFixo);
        System.out.println("Salário mais a comissão de vendas do mês: " + salarioTotal);
    }
}