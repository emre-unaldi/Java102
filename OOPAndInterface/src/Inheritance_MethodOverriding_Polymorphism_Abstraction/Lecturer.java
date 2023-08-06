package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Lecturer extends Academician {
    private String doorNumber;

    public Lecturer(String nameSurname, String phone, String email, String section, String degree, String doorNumber) {
        super(nameSurname, phone, email, section, degree);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeeting() {
        System.out.println(this.getNameSurname() + " senato toplantısı yapıyor");
    }

    public void makeTest() {
        System.out.println(this.getNameSurname() + " sınav yapıyor");
    }

    @Override
    public void login() {
        System.out.println(this.getNameSurname() +  " adlı öğretim görevlisi giriş yaptı");
    }

    @Override
    public void attendClass(String workHour) {
        System.out.println(this.getNameSurname() + " öğretim görevlisi derse " + workHour + " saatinde giriş yaptı");
    }
}
