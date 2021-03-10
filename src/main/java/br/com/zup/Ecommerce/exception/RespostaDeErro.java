package br.com.zup.Ecommerce.exception;

import java.util.List;

public class RespostaDeErro {

    private String tipoDeErro;
    private int codigo;
    private String status;
    private List<ObjetoDeErro> objetosdeErro;

    public  RespostaDeErro ( String  tipoDeErro , int  codigo , String  status , List < ObjetoDeErro >  objetosDeErro ) {
        this . tipoDeErro = tipoDeErro;
        this . codigo = codigo;
        this . status = status;
        this .objetosdeErro = objetosDeErro;
    }

    public  RespostaDeErro () {
    }

    public String getTipoDeErro() {
        return tipoDeErro;
    }

    public void setTipoDeErro(String tipoDeErro) {
        this.tipoDeErro = tipoDeErro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ObjetoDeErro> getObjetosdeErro() {
        return objetosdeErro;
    }

    public void setObjetosdeErro(List<ObjetoDeErro> objetosdeErro) {
        this.objetosdeErro = objetosdeErro;
    }
}


