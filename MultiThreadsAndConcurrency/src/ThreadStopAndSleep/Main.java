package ThreadStopAndSleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter(1, "c1");
        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(3000);
        c1.stop();

        Counter c2 = new Counter(2, "c2");
        Thread t2 = new Thread(c2);

        t2.start();
        Thread.sleep(1000);
        c2.stop();
    }
}
