package Inheritance_MethodOverriding_Polymorphism_Abstraction;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Patika Dev", "05078711189", "emree.unaldi@gmail.com");
        //Academician a1 = new Academician("Emre Ünaldı", "05078712233", "patika@gamil.com", "BM", "3");
        Officer o1 = new Officer("Çağatay Celimli", "050700000000", "celimli@co.uk", "IT", "24");
        Lecturer l1 = new Lecturer("Salih Kaplan", "05067893245", "salih.kaplan@gmail.com", "IT", "2", "38");
        Assistant as1 = new Assistant("Metehan", "05079876352", "metehan@gamil.com", "IT", "5", "36");
        Computing c1 = new Computing("Ahmet Atak", "05067893614", "ahmet@outlook.com", "IT", "78", "Kurulum");
        SecurityGuard s1 = new SecurityGuard("Mehmet", "05079634185", "mehmet@gamil.com","Security", "48","Guarding");

        // Polymorphism (Çok Biçimlilik)
        //Worker w2 = new Academician("Kodluyoruz", "05078712233", "patika@gamil.com", "BM", "3");
        //w2.login();

        /*
            a1.login(); // Method OverRiding
            l1.login(); // Method OverRiding
            a1.login("10:00"); // Method Overloading
            a1.login("10:00","17:00"); // Method Overloading
            a1.attendClass();
            l1.exit();
            w1.login();
            o1.diningHall();
            l1.makeTest();
            as1.attendClass();
            as1.makeQuiz();
            c1.work();
            c1.networkSetup();
            s1.work();
            s1.guardDuty();
        */

        Worker[] loginUser = {w1, o1, l1, as1, c1, s1};
        Worker.loginUsers(loginUser);

        l1.attendClass("24");
    }
}
