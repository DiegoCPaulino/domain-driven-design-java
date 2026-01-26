package com.rework.main;

import com.rework.entities.Candidato;
import com.rework.entities.Curso;

public class TesteCandidato {
    public static void main(String[] args) {
        Candidato cand = new Candidato(10, "Maria Silva", "123.456.789-00", "maria@email.com", "1234", "2000-05-12",
                "Reciclagem", "Ensino Médio", "Ativo");

        System.out.println("== CANDIDATO ==");
        System.out.println(cand);
        System.out.println("CPF válido? " + cand.validarCPF());
        System.out.println("Maior de idade? " + cand.maioridade());
        System.out.println("Tem formação? " + cand.temFormacao());

        Curso curso = new Curso(1, "Reciclagem Básica", "Trilha A", "Introdução aos processos");
        System.out.println("\n== CURSO ==");
        System.out.println("Descrição completa: " + curso.descCompleta());
    }
}
