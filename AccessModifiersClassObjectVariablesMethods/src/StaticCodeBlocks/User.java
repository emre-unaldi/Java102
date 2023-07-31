package StaticCodeBlocks;

public class User {
    public String name;
    public static int counter = 0;

    public User(String name){
        this.name = name;
        counter++;
    }

    static {
        System.out.println("Sınıfa bağlı static kod bloğu");
    }

    {
        System.out.println("Nesneye bağlı static kod bloğu");
    }

    /*
        static tanımlanmassa nesneye bağımlı olur ve her nesne üretildiğinde gelir
        static tanımlanırsa sınıfa bağımlı olur ve hafızaya alınır.
        User nesnesine erişim sağlandığında çalışır
    */

    /*
        Statik kod blokları statik değişken ve metodalara varsayılan değer atamak için kullanılır.
    */
}
