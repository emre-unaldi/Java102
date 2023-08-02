import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18){
            throw new AgeCheckException("Yaş hatası alındı !");
        }

        System.out.println("Yaşı uygundur !");
    }
    public static void main(String[] args) {
        /*System.out.println("Program başlaı !");

        int a = 0;
        int b = 20;

        try {
            System.out.println("Bölme İşlemi");
            System.out.println(b / a);
            System.out.println("Bölme İşlemi Bitti");
        } catch (Exception e) {
            System.out.println("Hata Yakalandı !");
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
            //e.printStackTrace();
        } finally {
            System.out.println("Bu bölüm kesinlikle çalışır");
        }

        System.out.println("Program Bitti !");*/



        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı girin : ");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch (AgeCheckException e) {
            System.out.println(e.toString());
        }

        System.out.println("Program bitti !");



    }
}
