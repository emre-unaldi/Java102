package StaticKeyWord;

public class Main {
    public static void show(){
        System.out.println("Hello Static Function");
    }
    public static void main(String[] args) {
        Player p1 = new Player("Emre Ünaldı", 38);
        System.out.println(p1.name);

        Player p2 = new Player("Çağatay Celimli", 01);
        System.out.println(p2.name); // nesneye ait değişken

        System.out.println(Player.game); // static nitelik - sınıf değişkeni
        System.out.println(Player.count);
        show();
    }
}
