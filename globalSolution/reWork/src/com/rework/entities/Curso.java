package com.rework.entities;

public class Curso {
    private int idCurso;
    private String nomeCurso;
    private String trilhaEduc;
    private String descricao;

    public Curso() { }

    public Curso(int idCurso, String nomeCurso, String trilhaEduc, String descricao) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.trilhaEduc = trilhaEduc;
        this.descricao = descricao;
    }

    public int getIdCurso() { return idCurso; }
    public void setIdCurso(int idCurso) { this.idCurso = idCurso; }

    public String getNomeCurso() { return nomeCurso; }
    public void setNomeCurso(String nomeCurso) { this.nomeCurso = nomeCurso; }

    public String getTrilhaEduc() { return trilhaEduc; }
    public void setTrilhaEduc(String trilhaEduc) { this.trilhaEduc = trilhaEduc; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String descCompleta() {
        return this.nomeCurso + " - " + this.trilhaEduc;
    }

    @Override
    public String toString() {
        return "\n\nCurso {" +
                "\nidCurso=" + idCurso +
                "\nnomeCurso='" + nomeCurso + '\'' +
                "\ntrilhaEduc='" + trilhaEduc + '\'' +
                "\ndescricao='" + descricao + '\'' + '}';
    }
}
