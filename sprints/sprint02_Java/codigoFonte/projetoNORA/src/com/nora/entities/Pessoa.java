package com.nora.entities;

import java.util.Date;

public abstract class Pessoa {
    private int id;
    private String nomeCompleto;
    private String telPrinc;
    private String telRes;
    private String criadoEm;

    public Pessoa() {
    }
    public Pessoa(int id, String nomeCompleto, String telPrinc, String telRes, String criadoEm) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.telPrinc = telPrinc;
        this.telRes = telRes;
        this.criadoEm = criadoEm;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelPrinc() {
        return telPrinc;
    }
    public void setTelPrinc(String telPrinc) {
        this.telPrinc = telPrinc;
    }

    public String getTelRes() {
        return telRes;
    }
    public void setTelRes(String telRes) {
        this.telRes = telRes;
    }

    public String getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
        return "\n\nPessoa {" +
                "\nid=" + id +
                "\nnomeCompleto='" + nomeCompleto + '\'' +
                "\ntelPrinc='" + telPrinc + '\'' +
                "\ntelRes='" + telRes + '\'' +
                "\ncriadoEm=" + criadoEm + '}';
    }

    public String obterPrimeiroNome() {
        if (nomeCompleto == null || nomeCompleto.isEmpty()) {
            return "N/A";
        }
        String[] partes = nomeCompleto.split(" ");
        return partes[0];
    }

    public String formatarTelefonePrincipal() {
        String telefoneLimpo = telPrinc.replaceAll("[^0-9]", "");

        if (telefoneLimpo.length() >= 8) {
            String ddd = telefoneLimpo.length() >= 10 ? telefoneLimpo.substring(0, 2) : "XX";
            String parte1 = telefoneLimpo.substring(telefoneLimpo.length() - 8, telefoneLimpo.length() - 4);
            String parte2 = telefoneLimpo.substring(telefoneLimpo.length() - 4);
            return "(" + ddd + ") " + parte1 + "-" + parte2;
        }
        return telPrinc;
    }
}
