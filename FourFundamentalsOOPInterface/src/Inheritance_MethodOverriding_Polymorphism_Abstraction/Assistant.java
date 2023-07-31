package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Assistant extends Academician {
    private String officeHour;

    public Assistant(String nameSurname, String phone, String email, String section, String degree, String officeHour) {
        super(nameSurname, phone, email, section, degree);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void makeQuiz() {
        System.out.println(this.getNameSurname() + " quiz yapıyor");
    }

    @Override
    public void attendClass(String workHour) {
        System.out.println(this.getNameSurname() + " asistan derse " + workHour + " saatinde giriş yaptı");
    }

}
