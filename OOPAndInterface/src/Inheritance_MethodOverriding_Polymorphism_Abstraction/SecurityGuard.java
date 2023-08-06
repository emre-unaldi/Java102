package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class SecurityGuard extends Officer{
    public String document;

    public SecurityGuard(String nameSurname, String phone, String email, String department, String workHours, String document) {
        super(nameSurname, phone, email, department, workHours);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void guardDuty() {
        System.out.println(this.getNameSurname() + " nöbet tutuyor");
    }
}
