package org.example;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a cotação do dólar atual: ");
        double cotDolar = scanner.nextDouble();

        System.out.println("Insira o valor de dólares para converter: ");
        double dolares = scanner.nextDouble();

        double totalConvertidoReal = cotDolar * dolares;

        System.out.println("Valor total convertido em Real é: " + totalConvertidoReal);




    }
}