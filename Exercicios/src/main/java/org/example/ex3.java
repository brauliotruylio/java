package org.example;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto: ");
        double consumoTotalDeCombustivel = scanner.nextDouble();

       double consumoMedio = distanciaPercorrida / consumoTotalDeCombustivel;

        System.out.println("o consumo médio desta viagem é " + consumoMedio + "Km/l");

    }
}