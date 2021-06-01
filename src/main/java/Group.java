import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Group {

    private int number;
    private List<Student> students = new ArrayList<>();

    public Group() {    }

    public Group(int number, List<Student> students) {
        this.number = number;
        this.students = students;
    }

    public Group(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @XmlElementWrapper
    @XmlElement(name = "student")
    public List<Student> getSpisok() {
        return students;
    }

    public void setSpisok(List<Student> spisok) {
        this.students = spisok;
    }

    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                ", students =" + students +
                '}';
    }


    public void addStudent(Student student) {students.add((Student) student);   }
}
