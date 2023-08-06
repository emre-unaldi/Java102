public class LambdaExpressions {
    public static void main(String[] args) {
        // Fonksiyonel Interface
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Sýnýfý");
            }
        };

        r1.run();

        // Lamda Expressions () ->
        Runnable r2 = () -> System.out.println("r2 sýnýfý");
        r2.run();

        Runnable r3 = () -> {
            System.out.println("r3 Sýnýfý");
        };
        r3.run();
        // Fonksiyonel Interfac'deki fonksiyonun içeriði aha ksýa olarak lamda ile yazabiliriz.
    }
}
