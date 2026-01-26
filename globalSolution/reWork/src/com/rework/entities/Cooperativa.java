package com.rework.entities;

public class Cooperativa extends Pessoa {
    private int idCoop;
    private String cnpj;
    private String nomeFantasia;
    private String areaAtuacao;

    public Cooperativa() { }

    public Cooperativa(int idCoop, String cnpj, String nomeFantasia, String areaAtuacao) {
        super(idCoop, nomeFantasia, null, null, null, null);
        this.idCoop = idCoop;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.areaAtuacao = areaAtuacao;
    }

    public int getIdCoop() { return idCoop; }
    public void setIdCoop(int idCoop) { this.idCoop = idCoop; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getAreaAtuacao() { return areaAtuacao; }
    public void setAreaAtuacao(String areaAtuacao) { this.areaAtuacao = areaAtuacao; }

    @Override
    public String toString() {
        return "\n\nCooperativa{" +
                "\nidCoop=" + idCoop +
                "\nnomeFantasia='" + nomeFantasia + '\'' +
                "\ncnpj='" + cnpj + '\'' +
                "\nareaAtuacao='" + areaAtuacao + '\'' + '}';
    }
}
