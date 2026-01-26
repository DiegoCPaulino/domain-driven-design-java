package com.nora.main;
import com.nora.entities.Atendimento;
import javax.swing.*;

public class TesteAtendimento {
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
        Atendimento objAtend = new Atendimento(
                inteiro("ID do atendimento:"),
                texto("Nome do dentista responsável:"),
                texto("Nome do paciente:"),
                data("Data agendada do atendimento (dd/mm/aaaa):"),
                data("Data realizada do atendimento (Deixe vazio se não foi concluído):"),
                texto("Prioridade do atendimento (Alta, Média, Baixa):"),
                texto("Tipo de procedimento:"),
                texto("Observações sobre o atendimento:"),
                data("Data de criação do registro:")
        );

        JOptionPane.showMessageDialog(null,
                "Atendimento registrado com sucesso!\n" +
                        "Dentista responsável: " + objAtend.getDentResp() + "\n" +
                        "Paciente: " + objAtend.getPaciente() + "\n" +
                        "Data agendada: " + objAtend.getDataAgendada() + "\n" +
                        "Procedimento: " + objAtend.getResumoProcedimento() + "\n" +
                        "Status de Conclusão: " + (objAtend.isConcluido() ? "Concluído em " + objAtend.getDataRealizada() : "Pendente")
        );

        System.out.println(
                objAtend
        );
    }
}