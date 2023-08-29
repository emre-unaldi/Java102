package RaceOfThreads;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> oddNumberList = new ArrayList<>();
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        ArrayList<Thread> threads = new ArrayList<>();

        int subListSize = 2500;
        int numberThreads = 4;

        for (int i = 0; i <= 10000; i++) {
            numberList.add(i);
        }

        for (int i = 0; i < numberThreads; i++) {
            int startIndex = i * subListSize;
            int endIndex = (i + 1) * subListSize;

            ArrayList<Integer> numberSubList = new ArrayList<>(numberList.subList(startIndex, endIndex));
            Thread thread = new Thread(new FindOddEvenNumbers(numberSubList, evenNumberList, oddNumberList));
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Çift Sayýlar : " + evenNumberList);
        System.out.println("Tek Sayýlar : " + oddNumberList);
    }
}
