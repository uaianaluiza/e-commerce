package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.exceptions.CadastroJaExisteException;
import br.com.zup.Ecommerce.exceptions.CadastroNaoEncontradoException;
import br.com.zup.Ecommerce.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {
    private static List<Cliente> clientes = new ArrayList<>();

    /**
     * Método cadastrarCliente verica se CPF e E-mails inseridos ainda não foram cadastrados,
     * caso não ele adiciona um novo cliente na lista de clientes
     * */

    public Cliente cadastrarCliente(Cliente cliente) {
        if ( !verificarSeCPFEstaCadastrado(cliente.getCpf()) || (!verificarSeEmailEstaCadastrado(cliente.getEmail()))){
            clientes.add(cliente);
            return cliente;
        }
        throw new CadastroJaExisteException("CPF já cadastrado");
    }


    public static List<Cliente> getClientes() {
        return clientes;
    }
    /**
     * Método pesquisarClientePeloNome permite a busca de um cliente pelo nome cadastrado
     * */
    public Cliente pesquisarClientePeloNome(String NomeDoCliente) {
        for (Cliente cliente : clientes) {
            if ( cliente.getNomeDoCliente().equals(NomeDoCliente) ) {
                return cliente;
            }
        }
        throw new CadastroNaoEncontradoException("Cliente não cadastrado");
    }
    /**
     * Método pesquisarClientePeloEmail permite a busca de um cliente pelo e-mail cadastrado
     * */
    public Cliente pesquisarClientePeloEmail(String Email) {
        for (Cliente cliente : clientes) {
            if ( cliente.getEmail().equals(Email) ) {
                return cliente;
            }
        }
        throw new CadastroNaoEncontradoException("Cliente não cadastrado");
    }
    /**
     * Método verificarSeCPFEstaCadastrado percorre a lista de clientes e verifica
     * se o CPF informado já foi cadastrado para outro cliente
     * */
    private boolean verificarSeCPFEstaCadastrado(String cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)){
                return true;
            }
        }return false;
    }
    /**
     * Método verificarSeEmailEstaCadastrado percorre a lista de clientes e verifica
     * se o e-mail informado já foi cadastrado para outro cliente
     * */
    private boolean verificarSeEmailEstaCadastrado(String email) {
        for (Cliente cliente : clientes) {
            if ( cliente.getEmail().equals(email) ) {
                return true;
            }
        }
        return false;
    }
}