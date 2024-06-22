import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descricao curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao BootCamp Santander Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJaime = new Dev();
        devJaime.setNome("Jaime");
        devJaime.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jaime: " + devJaime.getConteudosInscritos());

        devJaime.progredir();
        devJaime.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Jaime: " + devJaime.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jaime: " + devJaime.getConteudosConcluidos());
        System.out.println("XP: " + devJaime.calcularTotalXp());

        System.out.println("---------------------------------------");

        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jefferson: " + devJefferson.getConteudosInscritos());

        devJefferson.progredir();
        devJefferson.progredir();
        devJefferson.progredir();
        devJefferson.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Jefferson: " + devJefferson.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jefferson: " + devJefferson.getConteudosConcluidos());
        System.out.println("XP: " + devJefferson.calcularTotalXp());





    }
}
