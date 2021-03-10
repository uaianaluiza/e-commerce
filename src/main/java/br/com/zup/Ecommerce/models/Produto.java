package br.com.zup.Ecommerce.models;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Produto {
    @NotEmpty(message = "Nome não pode estar vazio")
    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 3, message = "Quantidade mínima de caractéres 3")
    private String nome;
    @Digits(integer=8,fraction=2)
    private double preco;
    private int quantidade;

    public Produto(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
