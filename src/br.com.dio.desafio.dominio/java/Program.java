import java.time.LocalDate;import java.util.Date;
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
        curso2.setCargaHoraria(2);

        System.out.println(curso2);

        System.out.println();
         Mentoria ment = new Mentoria();

         ment.setTitulo("Mentoria Java");
         ment.setDescricao("Curso Dio Java");
         ment.setData(LocalDate.now());

        System.out.println(ment);

    }
}