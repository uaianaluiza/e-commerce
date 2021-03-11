package br.com.zup.Ecommerce.models;


import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Produto> produtoscomprados;

    public Compra(){

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutoscomprados() {
        return produtoscomprados;
    }

    public void setProdutoscomprados(List<Produto> produtoscomprados) {
        this.produtoscomprados = produtoscomprados;
    }
}
