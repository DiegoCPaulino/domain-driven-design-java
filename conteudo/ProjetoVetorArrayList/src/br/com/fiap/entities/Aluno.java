package br.com.fiap.entities;

public class Aluno {
    private String nome;
    private int idade;
    private String rm;
    private String turma;
    private double nota;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String rm, String turma, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.rm = rm;
        this.turma = turma;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRm() {
        return rm;
    }
    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rm='" + rm + '\'' +
                ", turma='" + turma + '\'' +
                ", nota=" + nota +
                '}';
    }
}
