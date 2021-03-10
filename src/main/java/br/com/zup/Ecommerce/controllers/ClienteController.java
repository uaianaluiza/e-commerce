package br.com.zup.Ecommerce.controllers;

import br.com.zup.Ecommerce.models.Cliente;
import br.com.zup.Ecommerce.models.Produto;
import br.com.zup.Ecommerce.services.ClienteService;
import br.com.zup.Ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente (@RequestBody @Valid Cliente cliente){
        Cliente novoCliente = clienteService.cadastrarCliente(cliente);
        return novoCliente;

    }
    @GetMapping
    public List<Cliente> verClientes (){
        List<Cliente> todosClientes = clienteService.getClientes();
        return todosClientes;
    }
}
