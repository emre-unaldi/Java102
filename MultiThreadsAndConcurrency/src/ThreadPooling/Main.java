package ThreadPooling;
import CriticalSectionsAndRaceCondition.OrderMatic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            threadPool.execute(orderMatic);
        }

        System.out.println(orderMatic.getOrderNo());
    }
}

