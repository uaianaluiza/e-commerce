package br.com.zup.Ecommerce.controllers;

import br.com.zup.Ecommerce.models.Produto;
import br.com.zup.Ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public Produto cadastrarProduto (@RequestBody @Valid Produto produto){
        Produto novoProduto = produtoService.cadastrarProduto(produto);
        return novoProduto;

    }
    @GetMapping
    public List<Produto> verProdutos (){
        List<Produto> todosProdutos = produtoService.getProdutos();
        return todosProdutos;
    }

}
