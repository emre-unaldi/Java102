public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String[] award = new String[3];

    public Inventory() {
        this.weapon = new Weapon(-1,"Yumruk", 0, 0);
        this.armor = new Armor(-1,"Paçavra",0,0);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String[] getAward() {
        return award;
    }

    public void setAward(String[] award) {
        this.award = award;
    }
}
