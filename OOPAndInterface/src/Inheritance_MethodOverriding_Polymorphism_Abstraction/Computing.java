package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Computing extends Officer{
    public String task;

    public Computing(String nameSurname, String phone, String email, String department, String workHours, String task) {
        super(nameSurname, phone, email, department, workHours);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup() {
        System.out.println(this.getNameSurname() + " network kurulumunu yaptı");
    }
}
