import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Program {
    public static void main(String[] args) {


        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("curso DIO Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("curso DIO Java");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);

        System.out.println();
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Curso Dio Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("BootCamp Java Developer Dio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Vitor: " + devVitor.getConteudoInscritos());
        devVitor.progredir();  // = Concluido
        System.out.println("XP: " + devVitor.calcularTotalXp());

        System.out.println("-");
        System.out.println("Conteudos Inscritos Vitor: " + devVitor.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Vitor: " + devVitor.getConteudosConcluidos());

        System.out.println();
        System.out.println("--------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudoInscritos());
        
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


        System.out.println();


    }
}