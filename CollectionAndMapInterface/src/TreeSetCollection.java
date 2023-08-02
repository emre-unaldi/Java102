import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        // Özel bir sıra verilmek istendiğinde TreeSet kullanılır.
        // Sıralama için koşul belirtmek zorundayız

        // TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
        // new OrderNoteComparator().reversed() ise teersine sıralar

        students.add(new Student("Emre", 80, 10));
        students.add(new Student("Mustafa", 50, 20));
        students.add(new Student("Ahmet", 60, 30));

        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}