package CreateAndUseThread;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.start();
        c2.start();
    }
}
