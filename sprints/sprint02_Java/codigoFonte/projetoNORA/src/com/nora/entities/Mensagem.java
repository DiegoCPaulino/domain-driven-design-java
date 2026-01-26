package com.nora.entities;

import java.time.DateTimeException;

public class Mensagem {
    private int idMensag;
    private String textoMensag;
    private String canal;
    private String dataHora;
    private boolean possuiAnexo;

    public Mensagem() {
    }
    public Mensagem(int idMensag, String textoMensag, String canal, String dataHora, boolean possuiAnexo) {
        this.idMensag = idMensag;
        this.textoMensag = textoMensag;
        this.canal = canal;
        this.dataHora = dataHora;
        this.possuiAnexo = possuiAnexo;
    }

    public int getIdMensag() {
        return idMensag;
    }
    public void setIdMensag(int idMensag) {
        this.idMensag = idMensag;
    }

    public String getTextoMensag() {
        return textoMensag;
    }
    public void setTextoMensag(String textoMensag) {
        this.textoMensag = textoMensag;
    }

    public String getCanal() {
        return canal;
    }
    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isPossuiAnexo() {
        return possuiAnexo;
    }
    public void setPossuiAnexo(boolean possuiAnexo) {
        this.possuiAnexo = possuiAnexo;
    }

    @Override
    public String toString() {
        return "\n\nMensagem {" +
                "\nidMensag=" + idMensag +
                "\ntextoMensag='" + textoMensag + '\'' +
                "\ncanal='" + canal + '\'' +
                "\ndataHora=" + dataHora +
                "\npossuiAnexo=" + possuiAnexo + '}';
    }
}
