package org.invoice;

public class Invoice {

    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float preco;

    // Construtor
    public Invoice(int codigoItem, String descricao, int quantidade, float preco) {

        this.codigoItem = codigoItem;
        this.descricao = descricao;
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public double getInvoiceAmount() {
        return quantidade * preco;
    }

    //Getters e Setters
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {

        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
}
