import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(8);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos depois de progredir e concluir alguns ");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP : " + dev1.calcularTotalXp() + "\n");


        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos depois de progredir e concluir alguns ");
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP : " + dev2.calcularTotalXp());
//        System.out.println(bootcamp.getDevsInscritos());
    }
}