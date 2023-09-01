package org.example;

import java.util.Scanner;

public class ex5a {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de notas que serão informadas para calcular a média: ");
        int qtdN = scanner.nextInt();

        double[] nums = new double[qtdN];

        for (int i = 0; i < qtdN; i++) {
            System.out.println("Insira a nota" + (i + 1) + ": ");
            nums[i]  = scanner.nextDouble();
        }

        double somaN = 0;
        for (double num : nums) {
            somaN += num;
        }

        double media = somaN / qtdN;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Quantidade de notas calculadas: " + qtdN);
        System.out.println("A média do aluno é: " + media);



    }
}