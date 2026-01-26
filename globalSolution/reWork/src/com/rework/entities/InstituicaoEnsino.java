package com.rework.entities;

public class InstituicaoEnsino {
    private int idInst;
    private String cnpj;
    private String nomeInst;
    private String tipoInst;
    private Curso curso;
    private Endereco endereco;

    public InstituicaoEnsino() {
    }
    public InstituicaoEnsino(int idInst, String cnpj, String nomeInst, String tipoInst) {
        this.idInst = idInst;
        this.cnpj = cnpj;
        this.nomeInst = nomeInst;
        this.tipoInst = tipoInst;
    }

    public int getIdInst() {
        return idInst;
    }
    public void setIdInst(int idInst) {
        this.idInst = idInst;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeInst() {
        return nomeInst;
    }
    public void setNomeInst(String nomeInst) {
        this.nomeInst = nomeInst;
    }

    public String getTipoInst() {
        return tipoInst;
    }
    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nInstituicaoEnsino {" +
                "\nidInst=" + idInst +
                "\ncnpj='" + cnpj + '\'' +
                "\nnomeInst='" + nomeInst + '\'' +
                "\ntipoInst='" + tipoInst + '\'' +
                "\ncurso=" + curso + '\'' +
                "\nendereco=" + endereco + '}';
    }
}
