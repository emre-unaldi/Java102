package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Phone> phones = new ArrayList<>();
    private Integer phoneId = 1;
    public Phone(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Double screenSize, Integer ram) {
        super(id, unitPrice, discountRate, amountStock, productName, brandName, memory, screenSize, ram);
    }

    public Phone(){
        super();
    }

    public void handleOperations() {
        boolean isTurnBack = false;

        while (true) {
            System.out.println("########## Cep Telefonu İşlemleri ##########");
            System.out.println("------------------------------------------------");
            System.out.println("1 -> Ekleme");
            System.out.println("2 -> Silme");
            System.out.println("3 -> Listeleme");
            System.out.println("4 -> Id ile Ürün Bulma");
            System.out.println("5 -> Marka ile Ürün Bulma");
            System.out.println("0 -> Ana Menüye Dön");
            System.out.println("------------------------------------------------");
            System.out.println();

            System.out.print("Lütfen bir seçiminizi girin : ");
            int selected = this.scanner.nextInt();

            switch (selected) {
                case 0:
                    isTurnBack = true;
                    break;
                case 1:
                    this.add();
                    break;
                case 2:
                    this.delete();
                    break;
                case 3:
                    this.getList();
                    break;
                case 4:
                    this.findById();
                    break;
                case 5:
                    this.findByBrand();
                    break;
                default:
                    System.out.println("default");
            }

            if (isTurnBack) {
                Store.start();
                break;
            }
        }
    }

    public void add() {
        Phone phone = new Phone();
        phone.setId(getPhoneId());

        System.out.print("Birim Fiyatı : ");
        Integer unitPrice = scanner.nextInt();
        phone.setUnitPrice(unitPrice);

        System.out.print("İndirim oranı : ");
        Float discountRate = scanner.nextFloat();
        phone.setDiscountRate(discountRate);

        System.out.print("Stok Miktarı : ");
        Integer amountStock = scanner.nextInt();
        phone.setAmountStock(amountStock);

        scanner.nextLine();

        System.out.print("Ürün Adı : ");
        String productName = scanner.nextLine();
        phone.setProductName(productName);

        phone.setBrandName(Product.selectBrand());

        System.out.print("Hafıza : ");
        Integer memory = scanner.nextInt();
        phone.setMemory(memory);

        System.out.print("Ekran Boyutu : ");
        Double screenSize = scanner.nextDouble();
        phone.setScreenSize(screenSize);

        System.out.print("Ram : ");
        Integer ram = scanner.nextInt();
        phone.setRam(ram);

        getPhones().add(phone);
        setPhoneId(getPhones().size() + 1);
    }
    public void delete(){
        System.out.print("Lütfen silmek istediğiniz kaydın ID değerini girin : ");
        Integer deleteId = scanner.nextInt();

        boolean isDelete = getPhones().remove(getPhones().get(findIndexById(deleteId)));
        System.out.println(isDelete ? "İşlem Başarılı" : "İşlem Başarısız");
    }
    public Integer findIndexById(Integer id) {
        for (Phone phone : getPhones()) {
            if (phone.getId().equals(id)) {
                return getPhones().indexOf(phone);
            }
        }
        return null;
    }
    public void getList(){
        if (getPhones().isEmpty()) {
            System.out.println("Liste Boş");
        } else {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.format("| %-2s | %-10s | %-10s | %-10s | %-10s | %-5s | %-5s | %-5s | %-5s |%n",
                    "ID","Ürün","Marka","Fiyat","İndirim","Stok","Hafıza","Ekran","Ram");
            System.out.println("-------------------------------------------------------------------------------------------");
            for (Phone phone : getPhones()) {
                System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d |%n",
                        phone.getId(),
                        phone.getProductName(),
                        phone.getBrandName(),
                        phone.getUnitPrice(),
                        phone.getDiscountRate(),
                        phone.getAmountStock(),
                        phone.getMemory(),
                        phone.getScreenSize(),
                        phone.getRam());
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
    }
    public void findById() {
        boolean isFound = false;

        System.out.print("Lütfen bulmak istediğiniz kaydın ID değerini girin : ");
        Integer id = scanner.nextInt();

        for (Phone phone : getPhones()) {
            if (phone.getId().equals(id)) {
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d |%n",
                        phone.getId(),
                        phone.getProductName(),
                        phone.getBrandName(),
                        phone.getUnitPrice(),
                        phone.getDiscountRate(),
                        phone.getAmountStock(),
                        phone.getMemory(),
                        phone.getScreenSize(),
                        phone.getRam());
                System.out.println("-------------------------------------------------------------------------------------------");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("id'si " + id + " olan bir ürün kaydı bulunmamaktadır.");
        }
    }
    public void findByBrand() {
        if (getPhones().isEmpty()) {
            System.out.println("Liste boş");
        } else {
            String findBrand = Product.selectBrand();
            boolean isFound = false;

            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.format("| %-2s | %-10s | %-10s | %-10s | %-10s | %-5s | %-5s | %-5s | %-5s |%n",
                    "ID","Ürün","Marka","Fiyat","İndirim","Stok","Hafıza","Ekran","Ram");
            System.out.println("-------------------------------------------------------------------------------------------");
            for (Phone phone : getPhones()) {
                if (phone.getBrandName().equals(findBrand)) {
                    System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d |%n",
                            phone.getId(),
                            phone.getProductName(),
                            phone.getBrandName(),
                            phone.getUnitPrice(),
                            phone.getDiscountRate(),
                            phone.getAmountStock(),
                            phone.getMemory(),
                            phone.getScreenSize(),
                            phone.getRam());
                    System.out.println("-------------------------------------------------------------------------------------------");
                    isFound = true;
                }
            }

            if (!isFound) {
                System.out.println("Seçilen markaya ait kayıt bulunamadı");
            }
        }
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }
}

