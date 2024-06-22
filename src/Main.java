import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Completo");
        curso1.setCargaHoraria(8);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

    }
}
