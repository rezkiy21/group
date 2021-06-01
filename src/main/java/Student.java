import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"id", "name", "age", "marks"})
public class Student {
    private int id;
    private int age;
    private String name;
    private List <Integer> marks = new ArrayList<>();

    public Student() {
    }

    public Student(int id, int age, String name, List<Integer> marks) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElementWrapper
    @XmlElement(name = "mark")
    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
    public void addMark(int mark){
        marks.add(mark);
    }
}
