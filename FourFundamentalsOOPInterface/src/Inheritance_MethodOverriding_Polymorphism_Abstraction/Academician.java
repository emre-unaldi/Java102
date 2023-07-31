package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public abstract class Academician extends Worker {
    private String section;
    private String degree;

    public Academician(String nameSurname, String phone, String email, String section, String degree) {
        super(nameSurname, phone, email);
        this.section = section;
        this.degree = degree;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    // Abstract Method
    public abstract void attendClass(String workHour);

    @Override
    public void login() {
        System.out.println(this.getNameSurname() + " adlı akademisyen giriş yaptı");
    }
}