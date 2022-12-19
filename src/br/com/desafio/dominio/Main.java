package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("javascrit");
        curso2.setDescricao("curso javascrit");
        curso2.setCargaHoraria(8);

        conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("java");
        mentoria.setDescricao(" mentoria do curso java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
