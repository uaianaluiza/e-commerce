package br.com.zup.Ecommerce.DTOs;

import br.com.zup.Ecommerce.models.Produto;

public class ProdutoDTO {

    private String nome;

    public ProdutoDTO(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto converterDTOparaProduto(){
        Produto produto = new Produto();
        produto.setNome(this.nome);

        return produto;
    }
}
