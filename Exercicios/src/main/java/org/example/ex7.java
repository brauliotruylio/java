package org.example;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a temperatura atual em graus celsius: ");
        double tempCelsius = scanner.nextDouble();

        double F = (9 * tempCelsius + 160) / 5;

        System.out.println("A temperatura em farenheit é " + F);






    }
}