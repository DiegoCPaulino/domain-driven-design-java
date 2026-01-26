package com.rework.main;

import com.rework.entities.Endereco;
import com.rework.entities.InstituicaoEnsino;
import javax.swing.*;

public class TesteInstituicao {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        InstituicaoEnsino objInst = new InstituicaoEnsino();
        Endereco enderecoInst = new Endereco();

        objInst.setIdInst(inteiro("ID da instituição:"));
        objInst.setCnpj(texto("CNPJ:"));
        objInst.setNomeInst(texto("Nome da instituição:"));
        objInst.setTipoInst(texto("Tipo da instituição:"));

        enderecoInst.setLogradouro(texto("Logradouro da instituição:"));
        enderecoInst.setNumero(texto("Número:"));
        enderecoInst.setBairro(texto("Bairro:"));
        enderecoInst.setCidade(texto("Cidade:"));
        enderecoInst.setEstado(texto("Estado:"));
        enderecoInst.setPais(texto("País:"));
        enderecoInst.setCep(texto("CEP:"));

        objInst.setEndereco(enderecoInst);
        objInst.setCurso(null);

        JOptionPane.showMessageDialog(null,
                "Instituição cadastrada com sucesso!\n" +
                        "Nome: " + objInst.getNomeInst() + "\n" +
                        "CNPJ: " + objInst.getCnpj() + "\n" +
                        "Tipo: " + objInst.getTipoInst()
        );

        System.out.println(objInst + "\n" + enderecoInst);
    }
}