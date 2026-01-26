package com.rework.main;

import com.rework.entities.Colaborador;
import com.rework.entities.Endereco;
import javax.swing.*;

public class TesteColaborador {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Colaborador col = new Colaborador();
        Endereco ende = new Endereco();

        col.setIdColab(inteiro("ID do colaborador:"));
        col.setCargo(texto("Cargo:"));
        col.setDtAdmissao(texto("Data de admissão (dd/mm/aaaa):"));

        col.setNomeCompleto(texto("Nome completo:"));
        col.setCpf(texto("CPF:"));
        col.setEmail(texto("Email:"));
        col.setSenha(texto("Senha:"));
        col.setDataNasc(texto("Data de nascimento (dd/mm/aaaa):"));

        ende.setLogradouro(texto("Logradouro do colaborador:"));
        ende.setNumero(texto("Número:"));
        ende.setBairro(texto("Bairro:"));
        ende.setCidade(texto("Cidade:"));
        ende.setEstado(texto("Estado:"));
        ende.setPais(texto("País:"));
        ende.setCep(texto("CEP:"));

        col.setEndereco(ende);

        JOptionPane.showMessageDialog(null,
                "Colaborador cadastrado!\n" +
                        "Nome: " + col.getNomeCompleto() + "\n" +
                        "Cargo: " + col.getCargo()
        );

        System.out.println(col + "\n" + ende);
    }
}
