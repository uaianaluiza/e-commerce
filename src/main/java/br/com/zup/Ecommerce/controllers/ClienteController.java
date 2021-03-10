package br.com.zup.Ecommerce.controllers;

import br.com.zup.Ecommerce.models.Cliente;
import br.com.zup.Ecommerce.models.Produto;
import br.com.zup.Ecommerce.services.ClienteService;
import br.com.zup.Ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente (@RequestBody Cliente cliente){
        Cliente novoCliente = clienteService.cadastrarCliente(cliente);
        return novoCliente;

    }
    @GetMapping
    public List<Cliente> verClientes (){
        List<Cliente> todosClientes = clienteService.getClientes();
        return todosClientes;
    }
}
