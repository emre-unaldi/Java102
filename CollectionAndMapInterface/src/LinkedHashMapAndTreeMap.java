import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(102, new Student("Mustafa", 100, 102));
        students.put(110, new Student("Ahmet", 80, 110));
        students.put(108, new Student("Emre", 70, 108));
        students.put(118, new Student("Mehmet", 60, 118));

        for (Student student : students.values()){
            System.out.println(student.getName());
        }

        System.out.println("********************");

        TreeMap<Integer, Student> student = new TreeMap<>(new OrderByNoComparator());

        student.put(102, new Student("Mustafa", 100, 102));
        student.put(110, new Student("Ahmet", 80, 110));
        student.put(108, new Student("Emre", 70, 108));
        student.put(118, new Student("Mehmet", 60, 118));

        for (Student stu : student.values()){
            System.out.println(stu.getName());
        }
    }
}
