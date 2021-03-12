package br.com.zup.Ecommerce.DTOs;

import br.com.zup.Ecommerce.models.Cliente;
import br.com.zup.Ecommerce.models.Compra;
import br.com.zup.Ecommerce.models.Produto;

import java.util.List;

public class CompraDTO {
    private List<ProdutoDTO> produtosDTO;
    private String cpf;

    public CompraDTO() {

    }

    public List<ProdutoDTO> getProdutosDTO() {
        return produtosDTO;
    }

    public void setProdutosDTO(List<ProdutoDTO> produtosDTO) {
        this.produtosDTO = produtosDTO;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpfDoCliente(String cpf) {
        this.cpf = cpf;
    }

   public Compra converterDTOparaCompra(Cliente cliente, List<Produto> produto) {
        Compra compra = new Compra();
        compra.setProdutoscomprados(produto);
        compra.setCliente(cliente);

        return compra;
    }


}


