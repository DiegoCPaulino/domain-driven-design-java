package com.rework.entities;

public class Colaborador extends Pessoa{
    private int idColab;
    private String cargo;
    private String dtAdmissao;

    public Colaborador() {
    }
    public Colaborador(int id, String nomeCompleto, String cpf, String email, String senha, String dataNasc, int idColab, String cargo, String dtAdmissao) {
        super(id, nomeCompleto, cpf, email, senha, dataNasc);
        this.idColab = idColab;
        this.cargo = cargo;
        this.dtAdmissao = dtAdmissao;
    }

    public int getIdColab() {
        return idColab;
    }
    public void setIdColab(int idColab) {
        this.idColab = idColab;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }
    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    @Override
    public String toString() {
        return "\n\nColaborador {" +
                "\nidColab=" + idColab +
                "\ncargo='" + cargo + '\'' +
                "\ndtAdmissao='" + dtAdmissao + '\'' + "} " +
                super.toString();
    }
}
