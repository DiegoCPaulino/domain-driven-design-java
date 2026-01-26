package com.rework.entities;

public class Candidato extends Pessoa {
    private int idCandidato;
    private String areaInteresse;
    private String formacao;
    private String status;

    public Candidato() { }

    public Candidato(int idCandidato, String nomeCompleto, String cpf, String email, String senha, String dataNasc,
                     String areaInteresse, String formacao, String status) {
        super(idCandidato, nomeCompleto, cpf, email, senha, dataNasc);
        this.idCandidato = idCandidato;
        this.areaInteresse = areaInteresse;
        this.formacao = formacao;
        this.status = status;
    }

    public int getIdCandidato() { return idCandidato; }
    public void setIdCandidato(int idCandidato) { this.idCandidato = idCandidato; }

    public String getAreaInteresse() { return areaInteresse; }
    public void setAreaInteresse(String areaInteresse) { this.areaInteresse = areaInteresse; }

    public String getFormacao() { return formacao; }
    public void setFormacao(String formacao) { this.formacao = formacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean temFormacao() {
        return this.formacao != null && !this.formacao.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "\n\nCandidato {" +
                "\nidCandidato=" + idCandidato +
                "\nnome='" + getNomeCompleto() + '\'' +
                "\ncpf='" + getCpf() + '\'' +
                "\nareaInteresse='" + areaInteresse + '\'' +
                "\nformacao='" + formacao + '\'' +
                "\nstatus='" + status + '\'' + '}';
    }
}
