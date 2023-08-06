package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart no giriniz : ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihi giriniz : ");
        String date = input.next();

        System.out.print("Güvenlik kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.print("Banka seçiniz : ");
        int selectedBank = input.nextInt();

        switch (selectedBank) {
            case 1 :
                BankA aPos = new BankA("Ziraat Bankası", "38", "12345");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2 :
                BankB bPos = new BankB("Garanti Bankası", "46", "78965");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, date, cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz");
        }


    }
}
