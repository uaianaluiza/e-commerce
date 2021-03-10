package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.models.Cliente;
import br.com.zup.Ecommerce.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {
    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}
