import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
//        Group group = new Group(240102);
//        Student student1 = new Student(1, 20, "Дмитрий");
//        student1.addMark(5);
//        student1.addMark(8);
//        student1.addMark(10);
//        student1.addMark(6);
//        Student student2 = new Student(15, 21, "Сергей");
//        student2.addMark(9);
//        student2.addMark(8);
//        student2.addMark(10);
//        student2.addMark(7);
//        Student student3 = new Student(7, 20, "Денис");
//        student3.addMark(7);
//        student3.addMark(8);
//        student3.addMark(9);
//        student3.addMark(6);
//
//        group.addStudent(student1);
//        group.addStudent(student2);
//        group.addStudent(student3);
//
//        try {
//            JAXBContext jaxbContext = JAXBContext.newInstance(Group.class);
//            Marshaller marshaller = jaxbContext.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(group,new File("Group.xml"));
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Group.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Group group = (Group) unmarshaller.unmarshal(new File ("Group.xml"));
            System.out.println(group);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
