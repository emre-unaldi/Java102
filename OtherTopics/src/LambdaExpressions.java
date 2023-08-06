public class LambdaExpressions {
    public static void main(String[] args) {
        // Fonksiyonel Interface
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable S�n�f�");
            }
        };

        r1.run();

        // Lamda Expressions () ->
        Runnable r2 = () -> System.out.println("r2 s�n�f�");
        r2.run();

        Runnable r3 = () -> {
            System.out.println("r3 S�n�f�");
        };
        r3.run();
        // Fonksiyonel Interfac'deki fonksiyonun i�eri�i aha ks�a olarak lamda ile yazabiliriz.
    }
}
