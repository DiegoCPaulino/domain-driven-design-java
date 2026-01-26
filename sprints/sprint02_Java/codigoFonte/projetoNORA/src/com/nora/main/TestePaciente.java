package com.nora.main;

import com.nora.entities.Consentimento;
import com.nora.entities.Endereco;
import com.nora.entities.Mensagem;
import com.nora.entities.Paciente;
import javax.swing.*;

public class TestePaciente {

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
        Paciente objPac = new Paciente(
                inteiro("ID do paciente:"),
                texto("Nome completo do paciente:"),
                texto("Telefone principal do paciente:"),
                texto("Telefone reserva do paciente:"),
                data("Data de criação do paciente:"),
                data("Data de nascimento do paciente:"),
                texto("Sexo do paciente:"),
                texto("Raça ou etnia do paciente:"),
                texto("Status do paciente:"),
                real("Renda familiar do paciente:"),
                texto("RG do paciente:"),
                texto("CPF do responsável:")
        );

        Endereco enderecoPac = new Endereco(
                inteiro("ID do endereço do paciente:"),
                texto("Logradouro:"),
                inteiro("Número:"),
                texto("Complemento:"),
                texto("Bairro:"),
                texto("Cidade:"),
                texto("Estado:"),
                texto("CEP:"),
                texto("Tipo:")
        );

        Consentimento consentimentoPac = new Consentimento(
                inteiro("ID do consentimento:"),
                texto("Texto de consentimento:"),
                logico("Aceite do consentimento:"),
                texto("Data do consentimento:"),
                texto("Período de consentimento:")
        );

        Mensagem mensagemPac = new Mensagem(
                inteiro("ID da mensagem:"),
                texto("Texto da mensagem:"),
                texto("Canal da mensagem:"),
                texto("Data e hora da mensagem:"),
                logico("A mensagem possui anexo:")
        );

        objPac.setEndereco(enderecoPac);
        objPac.setConsentimento(consentimentoPac);
        objPac.setMensagem(mensagemPac);

        JOptionPane.showMessageDialog(null,
                "Paciente cadastrado com sucesso!\n" +
                        "Nome: " + objPac.getNomeCompleto() + "\n" +
                        "Endereço: " + enderecoPac.getLogradouro() + ", " + enderecoPac.getNumero() + "\n" +
                        "Consentimento: " + (consentimentoPac.isAceite() ? "Aceito" : "Não aceito")
        );

        System.out.println(
                objPac + "\n" +
                        enderecoPac + "\n" +
                        consentimentoPac + "\n" +
                        mensagemPac
        );
    }
}