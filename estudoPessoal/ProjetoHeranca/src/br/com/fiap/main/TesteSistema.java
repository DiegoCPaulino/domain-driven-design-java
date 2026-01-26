package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;


import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    // int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instanciar objetos

        // String nome, int idade, double renda, String status
        Cliente objCliente = new Cliente(
          texto("Nome"),
          inteiro("Idade"),
          real("Renda"),
          texto("Status")
        );

        // String logradouro, int numero, String cep
        Endereco objEndereco = new Endereco(
            texto("Logradouro"),
            inteiro("Numero"),
            texto("CEP")
        );

        objCliente.setEndereco(objEndereco);

        // String nome, int idade, double renda, int numeroCracha
        Colaborador objColaborador = new Colaborador(
            texto("Nome do colaborador"),
            inteiro("Idade do colaborador"),
            real("Salário do colaborador"),
            inteiro("Numero Crachá")
        );

        System.out.println(objCliente + "" + objColaborador);
    }

}
