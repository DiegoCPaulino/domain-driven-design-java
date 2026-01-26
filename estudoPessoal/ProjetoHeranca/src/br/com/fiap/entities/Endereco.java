package br.com.fiap.entities;

public class Endereco {

    private String logradouro;
    private int numero;
    private String cep;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return
                "\nlogradouro= " + logradouro +
                "\nnumero=" + numero +
                "\ncep= " + cep;
    }
}
