package br.com.fiap.entities;

public class Empresa {

    //visibilidade, tipo de dados e atributo
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    // metodo construtor com parametro vazio
    public Empresa() {
    }

    // metodo contrutor com parametro cheio
    public Empresa(String cnpj, String razaoSocial, String nomeFantasia) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    // metodos getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        return "\n\nEMPRESA " +
                "\ncnpj ='" + cnpj + '\'' +
                "\nrazão social ='" + razaoSocial + '\'' +
                "\nnome fantasia ='" + nomeFantasia + '\'';
    }
}
