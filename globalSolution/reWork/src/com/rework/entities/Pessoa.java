package com.rework.entities;

public class Pessoa {
    private int id;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String senha;
    private String dataNasc;
    private Endereco endereco;

    public Pessoa() { }

    public Pessoa(int id, String nomeCompleto, String cpf, String email, String senha, String dataNasc) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getDataNasc() { return dataNasc; }
    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public boolean validarCPF() {
        if (this.cpf == null) return false;
        String nums = this.cpf.replaceAll("[^0-9]", "");
        return nums.length() == 11;
    }

    public boolean maioridade() {
        if (this.dataNasc == null || this.dataNasc.length() < 4) {
            return false;
        }

        String ano = this.dataNasc.substring(0, 4);
        return ano.compareTo("2006") <= 0;
    }

    @Override
    public String toString() {
        return "\n\nPessoa {" +
                "\nid=" + id +
                "\nnomeCompleto='" + nomeCompleto + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\nemail='" + email + '\'' +
                "\ndataNasc='" + dataNasc + '\'' +
                "\nendereco=" + endereco + '}';
    }
}
