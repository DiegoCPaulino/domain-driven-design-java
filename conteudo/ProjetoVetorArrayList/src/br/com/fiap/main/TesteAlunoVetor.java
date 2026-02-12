package br.com.fiap.main;

import br.com.fiap.entities.Aluno;
import javax.swing.*;

public class TesteAlunoVetor {
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static double real(String j) {
        return Double.parseDouble((JOptionPane.showInputDialog(j)));
    }

    public static void main(String[] args) {
        // Prepara o vetor com a quantidade máxima
        Aluno[] vetorAluno = new Aluno[3];

        // Controla a posição dos vetores
        int indice = 0;

        // Laço de repetição
        do {
            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Nome:"));
            vetorAluno[indice].setRm(texto("RM:"));
            vetorAluno[indice].setTurma(texto("Turma:"));
            vetorAluno[indice].setIdade(inteiro("Idade:"));
            vetorAluno[indice].setNota(real("Nota:"));

            indice ++;
        } while (JOptionPane.showConfirmDialog(null,
                "Cadastrar mais alunos:",
                "CADASTRO DE ALUNOS",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        for(int contador = 0; contador < indice; contador ++) {
            System.out.println(
                    "Nome: " + vetorAluno[contador].getNome() +
                            "\nIdade: " + vetorAluno[contador].getIdade() +
                            "\nRM: " + vetorAluno[contador].getRm() +
                            "\nTurma: " + vetorAluno[contador].getTurma() +
                            "\nNota: " + vetorAluno[contador].getNota()
            );
    }


    }
}
