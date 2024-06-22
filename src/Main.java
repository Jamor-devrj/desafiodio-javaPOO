import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();


        curso1.setCargaHoraria(8);


        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

    }
}
