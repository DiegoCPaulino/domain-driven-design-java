package br.com.fiap.entities;

public class Colaborador extends Pessoa {

    private int numeroCracha;

    public Colaborador() {
    }

    public Colaborador(String nome, int idade, double renda, int numeroCracha) {
        super(nome, idade, renda);
        this.numeroCracha = numeroCracha;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    @Override
    public String toString() {
        return identificador() +
                "\nnumero do cracha= " + numeroCracha +
                 super.toString();
    }

    @Override
    public String identificador() {
        return "\n\nINFORMAÇÕES DO COLABORADOR";
    }
}
