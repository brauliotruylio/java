package org.pessoa;

public class Main {
    public static void main(String[] args) {
    //Exemplo de Uso
    Pessoa pessoa1 = new Pessoa("Braulio", "21/10/1971", 1.80f);

    //Exemplo de alteração de dados
    pessoa1.setAltura(1.85f);
    pessoa1.imprimirDados();

    }
}