import SubClasses.Person;
import SubClasses.Student;


public class javaMain {


    public static void main(String[] args){

        Person person = new Person(55501254,"Henrique", "hernqieu@hotiimail" );
        Student student = new Student(55552658,"Henrique", "hernqieu@hotiimail", 52655846, "ADS", "sexto");

        System.out.println(person.getName());
        System.out.println(student.toString());

    }


}