package com.nora.entities;

public class Atendimento {
    private int idAtend;
    private String dentResp;
    private String paciente;
    private String dataAgendada;
    private String dataRealizada;
    private String prioridade;
    private String tipoProced;
    private String observacoes;
    private String criadoEm;

    public Atendimento() {
    }
    public Atendimento(int idAtend, String dentResp, String paciente, String dataAgendada, String dataRealizada, String prioridade, String tipoProced, String observacoes, String criadoEm) {
        this.idAtend = idAtend;
        this.dentResp = dentResp;
        this.paciente = paciente;
        this.dataAgendada = dataAgendada;
        this.dataRealizada = dataRealizada;
        this.prioridade = prioridade;
        this.tipoProced = tipoProced;
        this.observacoes = observacoes;
        this.criadoEm = criadoEm;
    }

    public int getIdAtend() {
        return idAtend;
    }
    public void setIdAtend(int idAtend) {
        this.idAtend = idAtend;
    }

    public String getDentResp() {
        return dentResp;
    }
    public void setDentResp(String dentResp) {
        this.dentResp = dentResp;
    }

    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDataAgendada() {
        return dataAgendada;
    }
    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getDataRealizada() {
        return dataRealizada;
    }
    public void setDataRealizada(String dataRealizada) {
        this.dataRealizada = dataRealizada;
    }

    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getTipoProced() {
        return tipoProced;
    }
    public void setTipoProced(String tipoProced) {
        this.tipoProced = tipoProced;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
        return "\n\nAtendimento {" +
                "\nidAtend=" + idAtend +
                "\ndentResp='" + dentResp + '\'' +
                "\npaciente='" + paciente + '\'' +
                "\ndataAgendada='" + dataAgendada + '\'' +
                "\ndataRealizada='" + dataRealizada + '\'' +
                "\nprioridade='" + prioridade + '\'' +
                "\ntipoProced='" + tipoProced + '\'' +
                "\nobservacoes='" + observacoes + '\'' +
                "\ncriadoEm='" + criadoEm + '\'' +
                "\n}";
    }

    public boolean isConcluido() {
        return this.dataRealizada != null && !this.dataRealizada.trim().isEmpty();
    }

    public String getResumoProcedimento() {
        return "[" + this.prioridade + "] - " + this.tipoProced;
    }
}
