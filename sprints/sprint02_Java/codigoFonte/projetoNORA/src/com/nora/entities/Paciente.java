package com.nora.entities;

import java.util.Date;

public class Paciente extends Pessoa {
    private String dataNasc;
    private String sexo;
    private String cor;
    private String status;
    private double rendaFami;
    private String rgPac;
    private String cpfResp;
    private Endereco endereco;
    private Consentimento consentimento;
    private Mensagem mensagem;

    public Paciente() {
    }
    public Paciente(int id, String nomeCompleto, String telPrinc, String telRes, String criadoEm, String dataNasc, String sexo, String cor, String status, double rendaFami, String rgPac, String cpfResp) {
        super(id, nomeCompleto, telPrinc, telRes, criadoEm);
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cor = cor;
        this.status = status;
        this.rendaFami = rendaFami;
        this.rgPac = rgPac;
        this.cpfResp = cpfResp;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public double getRendaFami() {
        return rendaFami;
    }
    public void setRendaFami(double rendaFami) {
        this.rendaFami = rendaFami;
    }

    public String getRgPac() {
        return rgPac;
    }
    public void setRgPac(String rgPac) {
        this.rgPac = rgPac;
    }

    public String getCpfResp() {
        return cpfResp;
    }
    public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Consentimento getConsentimento() {
        return consentimento;
    }
    public void setConsentimento(Consentimento consentimento) {
        this.consentimento = consentimento;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }
    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "\n\nPaciente {" +
                "\nid=" + getId() +
                "\nnomeCompleto='" + getNomeCompleto() + '\'' +
                "\ntelPrinc='" + getTelPrinc() + '\'' +
                "\ntelRes='" + getTelRes() + '\'' +
                "\ncriadoEm='" + getCriadoEm() + '\'' +
                "\ndataNasc='" + dataNasc + '\'' +
                "\nsexo='" + sexo + '\'' +
                "\ncor='" + cor + '\'' +
                "\nstatus='" + status + '\'' +
                "\nrendaFami=" + rendaFami +
                "\nrgPac='" + rgPac + '\'' +
                "\ncpfResp='" + cpfResp + '\'' +

                "\n\nEndereco={" +
                "\n  logradouro='" + (endereco != null ? endereco.getLogradouro() : "N/A") + '\'' +
                "\n  numero=" + (endereco != null ? endereco.getNumero() : 0) +
                "\n  complemento='" + (endereco != null ? endereco.getComplemento() : "N/A") + '\'' +
                "\n  bairro='" + (endereco != null ? endereco.getBairro() : "N/A") + '\'' +
                "\n  cidade='" + (endereco != null ? endereco.getCidade() : "N/A") + '\'' +
                "\n  estado='" + (endereco != null ? endereco.getEstado() : "N/A") + '\'' +
                "\n  cep='" + (endereco != null ? endereco.getCep() : "N/A") + '\'' +
                "\n  tipoEndereco='" + (endereco != null ? endereco.getTipoEndereco() : "N/A") + '\'' +
                "\n}" +

                "\n\nConsentimento={" +
                "\n  idConsent=" + (consentimento != null ? consentimento.getIdConsent() : 0) +
                "\n  textoConsent='" + (consentimento != null ? consentimento.getTextoConsent() : "N/A") + '\'' +
                "\n  aceite=" + (consentimento != null ? consentimento.isAceite() : false) +
                "\n  data='" + (consentimento != null ? consentimento.getData() : "N/A") + '\'' +
                "\n  periodo='" + (consentimento != null ? consentimento.getPeriodo() : "N/A") + '\'' +
                "\n}" +

                "\n\nMensagem={" +
                "\n  idMensag=" + (mensagem != null ? mensagem.getIdMensag() : 0) +
                "\n  textoMensag='" + (mensagem != null ? mensagem.getTextoMensag() : "N/A") + '\'' +
                "\n  canal='" + (mensagem != null ? mensagem.getCanal() : "N/A") + '\'' +
                "\n  dataHora='" + (mensagem != null ? mensagem.getDataHora() : "N/A") + '\'' +
                "\n  possuiAnexo=" + (mensagem != null ? mensagem.isPossuiAnexo() : false) +
                "\n}" +
                "\n}";
    }

    public boolean validarCpfResponsavel() {
        String cpf = this.cpfResp.replaceAll("[^0-9]", "");
        return cpf.length() == 11;
    }
}