package RelationshipsBetweenClasses;

public class Course {
    public String courseName;
    public String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Course uses a Student (Course sınıfı Student sınıfına bağlı)
    public double calculateAverage(Student[] students) {
        double average = 0;
        for (Student student : students) {
            average += student.getNote();
        }

        return average / students.length;
    }
}
