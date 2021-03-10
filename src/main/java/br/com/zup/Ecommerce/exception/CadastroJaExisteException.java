package br.com.zup.Ecommerce.exception;

public class CadastroJaExisteException extends RuntimeException {
    private int status = 422;
    private String razao = "Este cadastro já existe";
    private String tipoErro = "Objeto já cadastrado";

    public CadastroJaExisteException() {

    }

    public CadastroJaExisteException(int status, String razao, String tipoErro) {
        this.status = status;
        this.razao = razao;
        this.tipoErro = tipoErro;
    }

    public CadastroJaExisteException(String message) {
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

