package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        // Instanciar objetos
        // Entradas (Colaborador e Endereço)
        //String nome, String cargo, int idade, double quantidadeHoras, double valorHora, double percentual
        Colaborador objColaborador = new Colaborador(
         JOptionPane.showInputDialog("Informe o nome"),
         JOptionPane.showInputDialog("Informe o cargo"),
         Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")),
         Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas")),
         Double.parseDouble(JOptionPane.showInputDialog("Valor da hora trabalhada")),
         Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto"))
        );

       // String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco(
                JOptionPane.showInputDialog("Logradouro"),
                Integer.parseInt(JOptionPane.showInputDialog("Numero")),
                JOptionPane.showInputDialog("Informe o complemento"),
                JOptionPane.showInputDialog("Informe o CEP"),
                JOptionPane.showInputDialog("Bairro"),
                JOptionPane.showInputDialog("Cidade"),
                JOptionPane.showInputDialog("Estado")
        );

        objColaborador.setEndereco(objEndereco);

        // Entradas (Empresa)
        // String cnpj, String razaoSocial, String nomeFantasia
        Empresa objEmpresa = new Empresa(
                JOptionPane.showInputDialog("CNPJ"),
                JOptionPane.showInputDialog("Razão Social"),
                JOptionPane.showInputDialog("Nome Fantasia")
        );

        System.out.println(
                objColaborador + "" + objEmpresa
        );
    }
}
