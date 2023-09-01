package org.conta;

public class ContaCorrente {
    //Variáveis
    int numeroConta;
    String nome;
    float saldo;

    //Construtor
    public ContaCorrente(int numeroConta, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0.0f;
    }

    //Getters and Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void alterarNome(String novoNome) {
        nome = novoNome;
    }

    public void deposito(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void saque(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }
}
