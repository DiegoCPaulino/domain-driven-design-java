package com.nora.main;

import com.nora.entities.Dentista;
import com.nora.entities.Endereco;
import com.nora.entities.Especialidade;
import javax.swing.*;

public class TesteDentista {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    static String data(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static boolean logico(String j) {
        String resp = JOptionPane.showInputDialog(j + " (sim/não):");
        return resp.equalsIgnoreCase("sim");
    }

    public static void main(String[] args) {
        Dentista objDent = new Dentista(
                inteiro("ID do dentista:"),
                texto("Nome completo do dentista:"),
                texto("Telefone principal:"),
                texto("Telefone reserva:"),
                data("Data de criação do cadastro:"),
                texto("CRO do dentista:"),
                logico("CRO validado?"),
                texto("E-mail do dentista:"),
                logico("Dentista é voluntário ativo?")
        );
        Especialidade especDent = new Especialidade(
                inteiro("ID da especialidade:"),
                texto("Nome da especialidade:"),
                texto("Descrição da especialidade:")
        );
        Endereco enderecoDent = new Endereco(
                inteiro("ID do endereço:"),
                texto("Logradouro:"),
                inteiro("Número:"),
                texto("Complemento:"),
                texto("Bairro:"),
                texto("Cidade:"),
                texto("Estado:"),
                texto("CEP:"),
                texto("Tipo de endereço:")
        );

        objDent.setEspecialidade(especDent);
        objDent.setEndereco(enderecoDent);

        JOptionPane.showMessageDialog(null,
                "Dentista cadastrado com sucesso!\n" +
                        "Nome: " + objDent.getNomeCompleto() + "\n" +
                        "Especialidade: " + especDent.getNomeEspec() + "\n" +
                        "CRO validado: " + (objDent.isCroValidado() ? "Sim" : "Não")
        );

        System.out.println(
                objDent + "\n" +
                        especDent + "\n" +
                        enderecoDent
        );
    }
}
