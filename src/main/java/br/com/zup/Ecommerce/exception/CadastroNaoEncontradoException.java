package br.com.zup.Ecommerce.exception;

import org.springframework.http.HttpStatus;

public class CadastroNaoEncontradoException extends RuntimeException {
    private int status = 400;
    private String razao = "Produto não cadastrado";
    private String tipoErro = "Objeto não cadastrado";

    public CadastroNaoEncontradoException(HttpStatus badRequest, String message) {

    }

    public CadastroNaoEncontradoException(int status, String razao, String tipoErro) {
        this.status = status;
        this.razao = razao;
        this.tipoErro = tipoErro;
    }

    public CadastroNaoEncontradoException(String message) {
        super(message);

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getTipoErro() {
        return tipoErro;
    }

    public void setTipoErro(String tipoErro) {
        this.tipoErro = tipoErro;
    }

}
