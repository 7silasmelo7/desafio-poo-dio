import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(java.time.LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSilas = new Dev();
        devSilas.setNome("Silas");
        devSilas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Silas: " + devSilas.getConteudosInscritos());


        devSilas.progredir();
        devSilas.progredir();
        devSilas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Silas: " + devSilas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Silas: " + devSilas.getConteudosConcluidos());
        System.out.println("XP: " + devSilas.calcularTotalXp());

        System.out.println("--------------");

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carol: " + devCarol.getConteudosConcluidos());
        System.out.println("XP: " + devCarol.calcularTotalXp());

    }
}
