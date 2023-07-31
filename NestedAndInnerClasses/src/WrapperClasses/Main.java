package WrapperClasses;

public class Main {
    public static void main(String[] args) {
//        int a = 20;
//        Integer b = 20;
//        String str = "abc";
//        Short s = 2;
        /*
            Integer sınıfından türemiş b nesnesidir.
            Wrapper sınıflarında klasik nesne türetme, constructorları kaldırılmıştır.
            Wrapper sınıflar kullanılarak tanımlanan değişkenlerde sınıf içerisinde tamımlanan
            metodlara erişme imkanı sağlar. ( toString(), parseInt() vs. )
        */

        // Boxing - Unboxing
        int a = 10;

        //Autoboxing
        Integer b = a; // Integer.valueOf(c)
        // Boxing
        Integer c = Integer.valueOf(a);

        // AutoUnboxing
        int d = c; // c.intValue()
        // Unboxing
        int i = c.intValue();


    }
}
