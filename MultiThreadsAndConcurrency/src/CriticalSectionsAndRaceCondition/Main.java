package CriticalSectionsAndRaceCondition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*OrderMatic orderMatic = new OrderMatic();

        Thread t1 = new Thread(orderMatic);
        t1.start();
        t1.join(); // iki threadin birbirinden ayrý ayrý çalýþmasýný saðlar


        Thread t2 = new Thread(orderMatic);
        t2.start();
        t2.join();*/

        OrderMatic orderMatic = new OrderMatic();
        List<Thread> operations = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(orderMatic);
            operations.add(t);
            t.start();
        }

        for (Thread t : operations) {
            t.join();
        }

        System.out.println(orderMatic.getOrderNo());
    }
}
