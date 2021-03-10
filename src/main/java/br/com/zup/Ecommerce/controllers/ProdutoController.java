package br.com.zup.Ecommerce.controllers;

import br.com.zup.Ecommerce.models.Produto;
import br.com.zup.Ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public Produto cadastrarProduto (@RequestBody Produto produto){
        Produto novoProduto = produtoService.cadastrarProduto(produto);
        return novoProduto;

    }

}
