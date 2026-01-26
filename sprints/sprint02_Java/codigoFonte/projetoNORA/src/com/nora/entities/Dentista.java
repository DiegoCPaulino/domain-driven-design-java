package com.nora.entities;

public class Dentista extends Pessoa {
    private String cro;
    private boolean croValidado;
    private String email;
    private boolean voluntAtivo;
    private Especialidade especialidade;
    private Endereco endereco;

    public Dentista() {
    }
    public Dentista(int id, String nomeCompleto, String telPrinc, String telRes, String criadoEm, String cro, boolean croValidado, String email, boolean voluntAtivo) {
        super(id, nomeCompleto, telPrinc, telRes, criadoEm);
        this.cro = cro;
        this.croValidado = croValidado;
        this.email = email;
        this.voluntAtivo = voluntAtivo;
    }

    public String getCro() {
        return cro;
    }
    public void setCro(String cro) {
        this.cro = cro;
    }

    public boolean isCroValidado() {
        return croValidado;
    }
    public void setCroValidado(boolean croValidado) {
        this.croValidado = croValidado;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVoluntAtivo() {
        return voluntAtivo;
    }
    public void setVoluntAtivo(boolean voluntAtivo) {
        this.voluntAtivo = voluntAtivo;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nDentista {" +
                "\nid=" + getId() +
                "\nnomeCompleto='" + getNomeCompleto() + '\'' +
                "\ntelPrinc='" + getTelPrinc() + '\'' +
                "\ntelRes='" + getTelRes() + '\'' +
                "\ncriadoEm='" + getCriadoEm() + '\'' +
                "\ncro='" + cro + '\'' +
                "\ncroValidado=" + croValidado +
                "\nemail='" + email + '\'' +
                "\nvoluntAtivo=" + voluntAtivo +
                "\n\nEspecialidade=" + (especialidade != null ? especialidade.getNomeEspec() : "Nenhuma") +
                "\n\nEndereco={" +
                "\n  logradouro='" + (endereco != null ? endereco.getLogradouro() : "N/A") + '\'' +
                "\n  numero=" + (endereco != null ? endereco.getNumero() : 0) +
                "\n  bairro='" + (endereco != null ? endereco.getBairro() : "N/A") + '\'' +
                "\n  cidade='" + (endereco != null ? endereco.getCidade() : "N/A") + '\'' +
                "\n  estado='" + (endereco != null ? endereco.getEstado() : "N/A") + '\'' +
                "\n  cep='" + (endereco != null ? endereco.getCep() : "N/A") + '\'' +
                "\n}" +
                "\n}";
    }
}
