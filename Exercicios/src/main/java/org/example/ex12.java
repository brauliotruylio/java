package org.example;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoComImpostos = custoFabrica * 1.45;

        double custoCosumidor = custoComImpostos * 1.28;

        System.out.println("Preço de venda ao consumidor: R$ " + custoCosumidor);
    }
}