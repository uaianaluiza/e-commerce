package br.com.zup.Ecommerce.models;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {
    @NotEmpty(message = "Nome não pode estar vazio")
    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 3, message = "Quantidade mínima de caractéres 3")
    private String nomeDoCliente;
    @CPF(message = "CPF inválido")
    private String cpf;
    @Email(message = "E-mail inválido")
    private String email;

    public Cliente(){

    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
