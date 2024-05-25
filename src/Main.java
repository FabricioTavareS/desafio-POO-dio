import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Descrição curso SQL");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabrcio = new Dev();
        devFabrcio.setNome("Fabrcio");
        devFabrcio.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devFabrcio.getConteudoInscritos());
        devFabrcio.progredir();
        System.out.println("*---*");
        System.out.println("Conteúdos inscritos" + devFabrcio.getConteudoInscritos());
        System.out.println("Conteúdos concluidos" + devFabrcio.getConteudosConcluidos());
        System.out.println("XP: " + devFabrcio.calcularTotalXp());
        System.out.println("*---*");

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.InscreverBootcamp(bootcamp);
        System.out.println("Contúdos inscritos" + devArthur.getConteudoInscritos());
        devArthur.progredir();
        System.out.println("*---*");
        System.out.println("Contúdos inscritos" + devArthur.getConteudoInscritos());
        System.out.println("Contúdos concluidos" + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devFabrcio.calcularTotalXp());








    }
}
