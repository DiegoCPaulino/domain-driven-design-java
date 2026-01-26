package com.rework.entities;

public class Endereco {
    private int idEnde;
    private String logradouro;
    private String numero;
    private String bairro;
    private String pais;
    private String tipoEnde;
    private String cep;
    private String estado;
    private String cidade;

    public Endereco() {
    }
    public Endereco(int idEnde, String logradouro, String numero, String bairro, String pais, String tipoEnde, String cep, String estado, String cidade) {
        this.idEnde = idEnde;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.pais = pais;
        this.tipoEnde = tipoEnde;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public int getIdEnde() {
        return idEnde;
    }
    public void setIdEnde(int idEnde) {
        this.idEnde = idEnde;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoEnde() {
        return tipoEnde;
    }
    public void setTipoEnde(String tipoEnde) {
        this.tipoEnde = tipoEnde;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n\nEndereco {" +
                "\nidEnde=" + idEnde +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero='" + numero + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\npais='" + pais + '\'' +
                "\ntipoEnde='" + tipoEnde + '\'' +
                "\ncep='" + cep + '\'' +
                "\nestado='" + estado + '\'' +
                "\ncidade='" + cidade + '\'' + '}';
    }
}
