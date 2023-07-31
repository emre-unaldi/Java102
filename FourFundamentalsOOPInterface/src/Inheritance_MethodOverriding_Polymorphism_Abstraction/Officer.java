package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Officer extends Worker {
    private String department;
    private String workHours;

    public Officer(String nameSurname, String phone, String email, String department, String workHours) {
        super(nameSurname, phone, email);
        this.department = department;
        this.workHours = workHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " Çalışıyor");
    }
}
