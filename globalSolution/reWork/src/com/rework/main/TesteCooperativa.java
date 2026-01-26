package com.rework.main;

import com.rework.entities.Cooperativa;
import com.rework.entities.Endereco;
import javax.swing.*;

public class TesteCooperativa {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Cooperativa coop = new Cooperativa();
        Endereco ende = new Endereco();

        coop.setIdCoop(inteiro("ID da cooperativa:"));
        coop.setNomeFantasia(texto("Nome Fantasia:"));
        coop.setCnpj(texto("CNPJ:"));
        coop.setAreaAtuacao(texto("Área de atuação:"));

        ende.setLogradouro(texto("Logradouro da cooperativa:"));
        ende.setNumero(texto("Número:"));
        ende.setBairro(texto("Bairro:"));
        ende.setCidade(texto("Cidade:"));
        ende.setEstado(texto("Estado:"));
        ende.setPais(texto("País:"));
        ende.setCep(texto("CEP:"));

        coop.setEndereco(ende);

        JOptionPane.showMessageDialog(null,
                "Cooperativa cadastrada!\n" +
                        "Nome Fantasia: " + coop.getNomeFantasia() + "\n" +
                        "Área: " + coop.getAreaAtuacao() + "\n" +
                        "CNPJ: " + coop.getCnpj()
        );

        System.out.println(coop + "\n" + ende);
    }
}
