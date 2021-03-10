package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static List<Produto> produtos = new ArrayList<>();

    public Produto cadastrarProduto(Produto produto){
        produtos.add(produto);
        return produto;
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public void produtoJaCadastrado(String nome) throws Exception{
        for (Produto produto : produtos){
            if (produto.getNome().equals(nome)){
                throw new Exception("Produto já cadastrado");
            }
        }
    }
}
