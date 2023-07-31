package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Worker {
    private String nameSurname;
    private String phone;
    private String email;

    public Worker(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void login() {
        System.out.println(this.nameSurname + " üniversiteye giriş yaptı.");
    }

    public void login(String loginHour) {
        System.out.println(this.nameSurname + " " + loginHour + " saatinde üniversiteye giriş yaptı.");
    }

    public void login(String loginHour, String exitHour) {
        System.out.println(this.nameSurname + " " + loginHour + " saatinde üniversiteye girdi ve " + exitHour + " saatinde çıktı");
    }

    public void exit() {
        System.out.println(this.nameSurname + " üniversiteden çıkış yaptı.");
    }

    public void diningHall() {
        System.out.println(this.nameSurname + " yemekhaneye girdi.");
    }

    public static void loginUsers(Worker[] loginUsers) {
        for (Worker worker : loginUsers) {
            worker.login();
        }
    }
    // Çalışan veri tipinde array alır ve listeler
}
