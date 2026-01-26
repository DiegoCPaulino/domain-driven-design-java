package com.nora.entities;

import java.util.Date;

public class Consentimento {
    private int idConsent;
    private String textoConsent;
    private boolean aceite;
    private String data;
    private String periodo;

    public Consentimento() {
    }
    public Consentimento(int idConsent, String textoConsent, boolean aceite, String data, String periodo) {
        this.idConsent = idConsent;
        this.textoConsent = textoConsent;
        this.aceite = aceite;
        this.data = data;
        this.periodo = periodo;
    }

    public int getIdConsent() {
        return idConsent;
    }
    public void setIdConsent(int idConsent) {
        this.idConsent = idConsent;
    }

    public String getTextoConsent() {
        return textoConsent;
    }
    public void setTextoConsent(String textoConsent) {
        this.textoConsent = textoConsent;
    }

    public boolean isAceite() {
        return aceite;
    }
    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "\n\nConsentimento {" +
                "\nidConsent=" + idConsent +
                "\ntextoConsent='" + textoConsent + '\'' +
                "\naceite=" + aceite +
                "\ndata=" + data +
                "\nperiodo=" + periodo + '}';
    }
}
