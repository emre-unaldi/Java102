package RelationshipsBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Emre", "Ünaldı", "38", "İncesu", 100);
        Student st2 = new Student("Hilal", "Yalçın", "38", "Kayseri", 80);
        Student st3 = new Student("Erdoğan", "Gündüz", "46", "Gaziantep", 90);

        Instructor teacher = new Instructor("Emre", "Ünaldı", "CENG");
        Course c = new Course("Kodlama", "102", teacher);

        // Composition, Aggretation
        // Course has a Instructor (Sınıfın bir öğretmeni vardır)
        System.out.println(c.getInstructor().getName());

        Student[] stu = {st1, st2, st3}; // veritipi Student sınıfı olan dizi
        System.out.println("Ortalama : " + c.calculateAverage(stu));
    }
}
