package br.com.fiap.entities;

public class Cliente extends Pessoa {

    private String status;
    private Endereco endereco; // atributo referência

    public Cliente() {
    }

    public Cliente(String nome, int idade, double renda, String status) {
        super(nome, idade, renda);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return identificador() +
                super.toString() +
                "\nstatus= " + status +
                "\nEndereço do cliente: " + endereco;
    }

    @Override
    public String identificador() {
        return "INFORMAÇÕES DO CLIENTE";
    }
}
