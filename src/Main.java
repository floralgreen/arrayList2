import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student stud1 = new Student("Federico", 23);
        Student stud2 = new Student("Marco", 35);
        Student stud3 = new Student("Matteo", 22);
        Student stud4 = new Student("Stefano", 21);
        Student stud5 = new Student("Luigi", 18);
        Student stud6 = new Student("Fabio", 39);
        Student stud7 = new Student("Fabiola", 41);
        Student stud8 = new Student("Chiara", 25);
        Student stud9 = new Student("Anna", 45);
        Student stud10 = new Student("Daniele", 40);
        Student stud11 = new Student("Danilo", 30);
        Student stud12 = new Student("Ivan", 29);

        List<Student> studentList = new ArrayList<>(List.of(stud1,stud2,stud3,stud4,stud5,stud6,stud7,stud8,stud9,stud10,stud11,stud12));

        //stampo lista non ordinata
        System.out.println(studentList);

        //ordino la lista
        studentList.sort(Comparator.comparing(Student::getName));

        //stampo listaordinata
        System.out.println(studentList);



    }

}

