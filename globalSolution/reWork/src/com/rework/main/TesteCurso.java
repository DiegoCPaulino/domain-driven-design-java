package com.rework.main;

import com.rework.entities.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "Reciclagem Avançada", "Trilha B", "Técnicas avançadas de triagem");
        System.out.println("== CURSO ==");
        System.out.println(curso);
        System.out.println("Descrição completa: " + curso.descCompleta());
    }
}
