package br.com.fiap.entities;

public class Colaborador {

    //visibilidade, tipo de dados e atributo
    private String nome;
    private String cargo;
    private int idade;
    private double quantidadeHoras;
    private double valorHora;
    private double percentual;
    private Endereco endereco; // atributo de referencia

    // metodo construtor com parametro vazio
    public Colaborador(){
    }

    // metodo construtor com parametro cheio
    public Colaborador(String nome, String cargo, int idade, double quantidadeHoras, double valorHora, double percentual) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        this.percentual = percentual;
    }

    // metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "COLABORADOR " +
                "\nnome ='" + nome + '\'' +
                "\ncargo ='" + cargo + '\'' +
                "\nidade =" + idade +
                "\nquantidade de horas =" + quantidadeHoras +
                "\nvalor da hora trabalhada =" + valorHora +
                "\nPercentual de desconto: " + percentual + " %" +
                "\n\nSALÁRIO BRUTO: " + calcularSalario() +
                "\nSTATUS DO SALÁRIO: " + informacaoSalario() +
                "\nVALOR DE DESCONTO: " + valorDesconto() +
                "\nSALÁRIO LIQUIDO: " + salarioLiquido() +
                "\n\nENDEREÇO DO COLABORADOR "  + endereco;
    }

    // calcularSalario
    public double calcularSalario(){
        return valorHora * quantidadeHoras;
    }

    //informacaoSalario
    public String informacaoSalario(){
        String informacao = null;
        if(calcularSalario() <= 3000.00){
            informacao = "Isento de desconto salarial";
        } else{
            informacao = "Possibilidade de haver desconto salarial";
        }
        return informacao;
    }

    // valorDesconto
    public double valorDesconto() {
        double desconto;
        if(calcularSalario() > 3000.00){
          desconto = calcularSalario() * percentual / 100;
        } else {
          desconto = 0;
        }
        return desconto;
    }

    // salarioLiquido
    public double salarioLiquido(){
       return  calcularSalario() - valorDesconto();
    }
}
