import java.util.ArrayList;
import java.util.Comparator;

public class NameBasedDisplay implements DisplayStrategy{

    public NameBasedDisplay(){};

    @Override
    public void display(ArrayList<Student> students){
        Student[] sortedStudents =
                students.stream().sorted(Comparator.comparing(Person::getLastName)).toArray(Student[]::new);
        for (Student student : sortedStudents){
            System.out.println(String.format("%s %s, %s: GPA: %f", student.getFirstName(), student.getLastName(),
                    student.getStudentID(), student.getGPA()));
        }
    }
}
