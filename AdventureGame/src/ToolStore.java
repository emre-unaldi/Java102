public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean showMenu = true;

    @Override
    public boolean onLocation() {
        System.out.println("---------------- Mağazaya Hoşgeldiniz ! ----------------");
        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz : ");
            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer, tekrar giriniz : ");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz. Görüşmek üzere !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------------------- Silahlar ----------------------");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(
                    "ID : " + weapon.getId()
                            + "\t Silah : " + weapon.getName()
                            + "\t Para : " + weapon.getPrice()
                            + "\t Hasar : " + weapon.getDamage()
            );
        }
        System.out.println("0 - Çıkış Yap !");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWaponID = input.nextInt();
        while (selectWaponID < 0 || selectWaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz bir değer, tekrar giriniz");
            selectWaponID = input.nextInt();
        }

        if (selectWaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjectById(selectWaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız !");

                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("---------------------- Zırhlar ----------------------");
        for (Armor armor : Armor.armors()) {
            System.out.println(
                    "ID : " + armor.getId()
                            + "\t Zırf : " + armor.getName()
                            + "\t Para : " + armor.getPrice()
                            + "\t Blok : " + armor.getBlock()
            );
        }
        System.out.println("0 - Çıkış Yap !");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Weapon.weapons().length) {
            System.out.println("Geçersiz bir değer, tekrar giriniz");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjectById(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
