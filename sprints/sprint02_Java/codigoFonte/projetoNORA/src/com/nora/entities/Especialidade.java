package com.nora.entities;

public class Especialidade {
    private int idEspec;
    private String nomeEspec;
    private String descricao;

    public Especialidade() {
    }
    public Especialidade(int idEspec, String nomeEspec, String descricao) {
        this.idEspec = idEspec;
        this.nomeEspec = nomeEspec;
        this.descricao = descricao;
    }

    public int getIdEspec() {
        return idEspec;
    }
    public void setIdEspec(int idEspec) {
        this.idEspec = idEspec;
    }

    public String getNomeEspec() {
        return nomeEspec;
    }
    public void setNomeEspec(String nomeEspec) {
        this.nomeEspec = nomeEspec;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n\nEspecialidade {" +
                "\nidEspec=" + idEspec +
                "\nnomeEspec='" + nomeEspec + '\'' +
                "\ndescricao='" + descricao + '\'' + '}';
    }
}
