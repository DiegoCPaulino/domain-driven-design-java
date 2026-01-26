package com.nora.main;

import com.nora.entities.Agendamento;
import javax.swing.JOptionPane;

public class TesteAgendamento {

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
        Agendamento objAgend = new Agendamento(
                inteiro("ID do agendamento:"),
                data("Data do agendamento (dd/mm/aaaa):"),
                texto("Hora do agendamento (hh:mm):"),
                texto("Status:"),
                texto("Nome do Paciente:"),
                texto("Nome do Dentista:")
        );

        String dataAtualTeste = data("Informe a data atual para teste (dd/mm/aaaa):");

        JOptionPane.showMessageDialog(null,
                "Agendamento registrado com sucesso!\n" +
                        "Paciente: " + objAgend.getPaciente() + "\n" +
                        "Dentista: " + objAgend.getDentista() + "\n" +
                        "Data/Hora: " + objAgend.concatenarDataHora() + "\n" +
                        "Status: " + objAgend.getStatus() + "\n" +
                        "Agendado para hoje (" + dataAtualTeste + ")? " + (objAgend.AgendadoParaHoje(dataAtualTeste) ? "Sim" : "Não")
        );
        System.out.println(
                objAgend
        );
    }
}