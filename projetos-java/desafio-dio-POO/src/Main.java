import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devUziel = new Dev();
        devUziel.setNome("UZIEL");
        devUziel.inscreverBootcamp(bootCamp);
        System.out.println(devUziel.getNome());
        System.out.println("Conteúdos Inscritos: " + devUziel.getConteudosInscritos());
        devUziel.progredir();
        System.out.println("Conteúdos Concluidos: " + devUziel.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + devUziel.getConteudosInscritos());
        System.out.println("XP: " + devUziel.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("JOÃO");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println(devJoao.getNome());
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos: " + devUziel.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
