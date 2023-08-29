package PatikaStore;

import java.util.Scanner;

public class Store {
    public static Scanner scanner = new Scanner(System.in);
    public static void start() {
        boolean isExit = false;

        while (true) {
            System.out.println("########## Patika Ürün Yönetim Paneli ##########");
            System.out.println("------------------------------------------------");
            System.out.println("1 -> Telefon İşlemleri");
            System.out.println("2 -> Bilgisayar İşlemleri");
            System.out.println("3 -> Markaları Listele");
            System.out.println("0 -> Çıkış Yap");
            System.out.println("------------------------------------------------");
            System.out.println();

            System.out.print("Lütfen bir seçiminizi girin : ");
            int selected = scanner.nextInt();

            switch (selected) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    new Phone().handleOperations();
                    break;
                case 2:
                    new Computer().handleOperations();
                    break;
                case 3:
                    new Brand().displayBrands();
                    break;
                default:
                    System.out.println("default");
            }

            if (isExit) {
                System.out.println("Görüşmek Üzere !!!");
                break;
            }
        }
    }
}

