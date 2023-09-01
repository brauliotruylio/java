package org.conta;


public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(12345, "Braulio", 0.0f);

        System.out.println("Saldo inicial: " + conta1.getSaldo());

        conta1.deposito(1000.0f);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        conta1.saque(500.0f);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        conta1.alterarNome("João Silva");
        System.out.println("Novo nome do correntista: " + conta1.nome);
    }
}