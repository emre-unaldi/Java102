import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String characterName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private int originalHealth;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("########################### Karakterler #############################");
        System.out.println("--------------------------------------------------------------------");
        for (GameCharacter gameCharacter : characterList) {
            System.out.println(
                    "ID : " + gameCharacter.getId()
                            + "\t Karakter : " + gameCharacter.getName()
                            + "\t Hasar : " + gameCharacter.getDamage()
                            + "\t Sağlık : " + gameCharacter.getHealth()
                            + "\t Para : " + gameCharacter.getMoney()
            );
        }
        System.out.println("--------------------------------------------------------------------");

        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectCharacter = input.nextInt();
        switch (selectCharacter) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

        /*System.out.println(
                "Karakter : " + this.getCharacterName()
                        + "\t Hasar : " + this.getDamage()
                        + "\t Sağlık : " + this.getHealth()
                        + "\t Para : " + this.getMoney()
        );*/
    }

    public void printInfo() {
        System.out.println(
                "Silah : " + this.getInventory().getWeapon().getName()
                        + "\t Zırh : " + this.getInventory().getArmor().getName()
                        + "\t Bloklama : " + this.getInventory().getArmor().getBlock()
                        + "\t Hasar : " + this.getTotalDamage()
                        + "\t Sağlık : " + this.getHealth()
                        + "\t Para : " + this.getMoney()
        );
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setCharacterName(gameCharacter.getName());
        this.setDamage(gameCharacter.getDamage());
        this.setOriginalHealth(gameCharacter.getHealth());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
