import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir oyuncu ismi girin : ");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println("####################################################################");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve puslu vadiye hoşgeldiniz !");
        System.out.println("Burada yaşananların hepsi birer hayal ürünüdür !");
        System.out.println("####################################################################");


        System.out.println("Lütfen bir karakter seçiniz !");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("############################ Bölgeler ##############################");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1 - Güvenli Ev -> Burası sizin için güvenlidir. Düşman yoktur !");
            System.out.println("2 - Eşya Dükkanı -> Silah veya zırh satın alabilirsiniz !");
            System.out.println("3 - Mağara -> Ödül <Yemek> | Dikkatli ol karşına zombi çıkabilir !");
            System.out.println("4 - Orman -> Ödül <Odun> | Dikkatli ol karşına vampir çıkabilir !");
            System.out.println("5 - Nehir -> Ödül <Su> | Dikkatli ol karşına ayı çıkabilir !");
            System.out.println("0 - Oyunu Sonlandır !");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");

            int selectedLocation = input.nextInt();
            switch (selectedLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location == null) {
                System.out.println("Oyun Bitti... Yine Bekleriz !");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game Over !!!");
                break;
            }
        }
    }
}
