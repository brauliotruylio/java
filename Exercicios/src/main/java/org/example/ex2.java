package org.example;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma destes números é " + soma);
        System.out.println("A subtração destes números é " + subtracao);
        System.out.println("A multiplicação destes números é " + multiplicacao);
        System.out.println("A divisão destes números é " + divisao);
    }
}