package com.nora.entities;

public class Endereco {
    private int idEndereco;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String tipoEndereco;

    public Endereco() {
    }
    public Endereco(int idEndereco, String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String cep, String tipoEndereco) {
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tipoEndereco = tipoEndereco;
    }

    public int getIdEndereco() {
        return idEndereco;
    }
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }
    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    @Override
    public String toString() {
        return "\n\nEndereco {" +
                "\nidEndereco=" + idEndereco +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero=" + numero +
                "\ncomplemento='" + complemento + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nestado='" + estado + '\'' +
                "\ncep='" + cep + '\'' +
                "\ntipoEndereco='" + tipoEndereco + '\'' + '}';
    }
}
