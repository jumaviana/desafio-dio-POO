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

        //System.out.println(curso1);
       // System.out.println(curso2);
        //System.out.println(mentoria);

        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("curso de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        dev devCamila = new dev();
        devCamila.setNome("Camila");
        devCamila.inscreveBootcamp(bootcamp);

        System.out.println("conteudo inscrito" + devCamila.getConteudosinscritos());
        System.out.println("conteudo inscrito" + devCamila.getConteudosinscritos());
        devCamila.progredir();
        System.out.println("---------");
        System.out.println("conteudo inscrito" + devCamila.getConteudosinscritos());
        System.out.println("conteudo concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXpTotal());

        System.out.println("--");

        dev devjoaquim = new dev();
        devjoaquim.inscreveBootcamp(bootcamp);
        System.out.println("conteudo inscrito" + devjoaquim.getConteudosinscritos());
        devjoaquim.progredir();
        System.out.println("-------");
        devjoaquim.setNome("Joaquim");

        System.out.println("conteudo inscrito" + devjoaquim.getConteudosinscritos());
        System.out.println("conteudo concluidos" + devjoaquim.getConteudosConcluidos());
        System.out.println("XP:" + devjoaquim.calcularXpTotal());
    }

}
