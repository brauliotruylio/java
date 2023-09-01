package org.pessoa;


public class Pessoa {
     private String nome;
     private String dataNascimento;
     private float altura;

    //Construtor
    public Pessoa(String nome, String dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    //Método
    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Altura: " + this.altura);
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
