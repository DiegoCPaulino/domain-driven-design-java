package com.nora.entities;

public class Agendamento {

    private int idAgendamento;
    private String data;
    private String hora;
    private String status;
    private String paciente;
    private String dentista;

    public Agendamento() {
    }

    public Agendamento(int idAgendamento, String data, String hora, String status, String paciente, String dentista) {
        this.idAgendamento = idAgendamento;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }
    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDentista() {
        return dentista;
    }
    public void setDentista(String dentista) {
        this.dentista = dentista;
    }

    @Override
    public String toString() {
        return "\n\nAgendamento {" +
                "\nidAgendamento=" + idAgendamento +
                "\ndata='" + data + '\'' +
                "\nhora='" + hora + '\'' +
                "\nstatus='" + status + '\'' +
                "\npaciente='" + (paciente != null ? paciente : "N/A") + '\'' +
                "\ndentista='" + (dentista != null ? dentista : "N/A") + '\'' +
                "\n}";
    }

    public boolean AgendadoParaHoje(String dataAtual) {
        if (this.data == null || dataAtual == null) {
            return false;
        }
        return this.data.equals(dataAtual);
    }

    public String concatenarDataHora() {
        return this.data + " às " + this.hora;
    }
}