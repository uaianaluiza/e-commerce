package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.exceptions.CadastroJaExisteException;
import br.com.zup.Ecommerce.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static List<Produto> produtos = new ArrayList<>();
    /**
     * Método cadastrarProduto verica se já existe um produto de mesmo nome,
     * caso não, ele adiciona um novo produto na lista de produtos
     * */

    public Produto cadastrarProduto(Produto produto) {
        if ( produtoJaCadastrado(produto.getNome()) ) ;
        produtos.add(produto);
        return produto;
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }


    /**
     * Método produtoJaCadastrado verica se já existe um produto de mesmo nome,
     * caso aja ele não permite o cadastro.
     * */
    private boolean produtoJaCadastrado(String nome) {
        for (Produto produto : produtos) {
            if ( produto.getNome().equals(nome) ) {
                throw new CadastroJaExisteException();
            }
        }
        return false;
    }
}


