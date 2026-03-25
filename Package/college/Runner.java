package college;
import college.Student.Student;
import college.Faculty.Faculty;
public class Runner{
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.displayStudent();
        f.displayFaculty();
    }
}
