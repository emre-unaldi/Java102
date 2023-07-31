import java.util.Random;

public abstract class BattleLocation extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        System.out.println("");
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli Ol ! Burada " + this.randomMonsterNumber() + " tane " + this.getMonster().getName() + " yaşıyor !");
        System.out.println("<S>avaş | <K>aç ");

        String selecBattleCase = input.nextLine().toUpperCase();

        if (selecBattleCase.equals("S") && combat(this.getMaxMonster())) {
            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            return true;
        }

        if (this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz !!!");
            return false;
        }
        return true;
    }

    public void afterHit(){
        System.out.println("*******************************************");
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + " Canı : " + this.getMonster().getHealth());
        System.out.println("*******************************************");
    }

    public boolean combat(int maxMonster){
        for (int i = 1; i < maxMonster; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0){
                System.out.println("<V>ur | <K>aç");
                String selectCombatCase = input.nextLine().toUpperCase();
                if (selectCombatCase.equals("V")){
                    System.out.println(this.getPlayer().getTotalDamage() + " gücünde vurdunuz");
                    monster.setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monsterDamage < 0){
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                    }

                } else {
                    return false;
                }
            }

            if (this.getMonster().getHealth() < this.getPlayer().getHealth()){
                System.out.println("------------------------------------------------------------");
                System.out.println(i + ". Düşmanı yendiniz !");
                System.out.println(this.getMonster().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                System.out.println("------------------------------------------------------------");
            } else {
                return false;
            }

        }
        return false;
    }

    public void playerStats(){
        System.out.println("--------------------- Oyuncu Değerleri ---------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println("------------------------------------------------------------");
    }

    public void monsterStats(int i){
        System.out.println("---------------------- " + i + "." + this.getMonster().getName() + " Değerleri ---------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Sağlık : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Ödül : " + this.getMonster().getAward());
        System.out.println("------------------------------------------------------------");
    }

    public int randomMonsterNumber(){
        Random random = new Random();
        return random.nextInt(this.getMaxMonster()) + 1;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
