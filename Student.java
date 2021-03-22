import java.util.*;

public class Student {
    String surname;
    static int id_students = 0;
    public static int num_students;
    public static LinkedHashMap<String, String> map = new LinkedHashMap<>();

    Student(){
        num_students++;
        id_students += 1;
        String id_students_str = String.format("%04d", id_students);
        surname = "Student with a surname";
        map.put(id_students_str, surname);
    }

    Student(String sur_name){
        num_students++;
        id_students += 1;
        String id_students_str = String.format("%04d", id_students);
        surname = sur_name;
        map.put(id_students_str, surname);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivanov");
        Student student2 = new Student("Antonov");
        Student student3 = new Student("Andreev");
        Student student4 = new Student("Petrov");
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println("Student id = " + item.getKey() + "; Student surname = " + item.getValue());
        }

        System.out.println();
        System.out.print("number of students: ");
        System.out.print(num_students);
    }
}
