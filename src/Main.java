import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8, "curso java", "descrição curso java");

        Curso curso2 = new Curso(4, "curso js", "descrição curso js");

        Mentoria mentoria = new Mentoria(LocalDate.now(), "mentoria de java", "descrição mentoria java");

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKauan = new Dev("Kauan");
        devKauan.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Kauan:" + devKauan.getConteudosInscritos());
        devKauan.progredir();
        devKauan.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kauan:" + devKauan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kauan:" + devKauan.getConteudosConcluidos());
        System.out.println("XP:" + devKauan.calcularTotalXp());

        System.out.println("-------");

        Dev devMelissa = new Dev("Melissa");
        devMelissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Melissa:" + devMelissa.getConteudosInscritos());
        devMelissa.progredir();
        devMelissa.progredir();
        devMelissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Melissa:" + devMelissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Melissa:" + devMelissa.getConteudosConcluidos());
        System.out.println("XP:" + devMelissa.calcularTotalXp());
    }
}