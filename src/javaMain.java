import SubClasses.Person;
import SubClasses.Professor;
import SubClasses.Student;


public class javaMain {


    public static void main(String[] args){

        Person person = new Person(55501254,"Henrique", "hernqieu@hotiimail" );
        Student student = new Student(55552658,"Henrique", "hernqieu@hotiimail", 52655846, "ADS", "sexto");
        Professor professor = new Professor(55501254,"Henrique", "hernqieu@hotiimail" ,55562517, "mestre", "exatas");

        Person vetor[] = {person, student, professor};

        for (int i = 0 ; i < vetor.length; i++) System.out.println(vetor[i].toString());



    }


}