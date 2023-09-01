package org.example;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a 1ª nota deste aluno: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a 2ª nota deste aluno: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a 3ª nota deste aluno: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do aluno: " + media);

    }
}