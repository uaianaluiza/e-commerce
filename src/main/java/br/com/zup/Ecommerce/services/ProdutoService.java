package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.exceptions.CadastroJaExisteException;
import br.com.zup.Ecommerce.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static List<Produto> produtos = new ArrayList<>();

    public Produto cadastrarProduto(Produto produto) {
        if ( produtoJaCadastrado(produto.getNome()) ) ;
        produtos.add(produto);
        return produto;
    }


    public static List<Produto> getProdutos() {
        return produtos;
    }

    private boolean produtoJaCadastrado(String nome) {
        for (Produto produto : produtos) {
            if ( produto.getNome().equals(nome) ) {
                throw new CadastroJaExisteException();
            }
        }
        return false;
    }
}


