package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Computer extends Product{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Computer> computers = new ArrayList<>();
    private Integer computerId = 1;
    private Integer batteryPower;
    private String color;

    public Computer(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Double screenSize, Integer ram, Integer batteryPower, String color) {
        super(id, unitPrice, discountRate, amountStock, productName, brandName, memory, screenSize, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public Computer(){
        super();
    }

    public void handleOperations() {
        boolean isTurnBack = false;

        while (true) {
            System.out.println("########## Bilgisayar İşlemleri ##########");
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

    public void add(){
        Computer computer = new Computer();
        computer.setId(getComputerId());

        System.out.print("Birim Fiyatı : ");
        Integer unitPrice = scanner.nextInt();
        computer.setUnitPrice(unitPrice);

        System.out.print("İndirim oranı : ");
        Float discountRate = scanner.nextFloat();
        computer.setDiscountRate(discountRate);

        System.out.print("Stok Miktarı : ");
        Integer amountStock = scanner.nextInt();
        computer.setAmountStock(amountStock);

        scanner.nextLine();

        System.out.print("Ürün Adı : ");
        String productName = scanner.nextLine();
        computer.setProductName(productName);

        computer.setBrandName(Product.selectBrand());

        System.out.print("Hafıza : ");
        Integer memory = scanner.nextInt();
        computer.setMemory(memory);

        System.out.print("Ekran Boyutu : ");
        Double screenSize = scanner.nextDouble();
        computer.setScreenSize(screenSize);

        System.out.print("Ram : ");
        Integer ram = scanner.nextInt();
        computer.setRam(ram);

        System.out.print("Batarya Gücü : ");
        Integer batteryPower = scanner.nextInt();
        computer.setBatteryPower(batteryPower);

        scanner.nextLine();

        System.out.print("Renk : ");
        String color = scanner.nextLine();
        computer.setColor(color);

        getComputers().add(computer);
        setComputerId(getComputers().size() + 1);
    }
    public void delete(){
        System.out.print("Lütfen silmek istediğiniz kaydın ID değerini girin : ");
        Integer deleteId = scanner.nextInt();

        boolean isDelete = getComputers().remove(getComputers().get(findIndexById(deleteId)));
        System.out.println(isDelete ? "İşlem Başarılı" : "İşlem Başarısız");
    }
    public Integer findIndexById(Integer id) {
        for (Computer computer : getComputers()){
            if (computer.getId().equals(id)) {
                return getComputers().indexOf(computer);
            }
        }
        return null;
    }
    public void getList(){
        if (getComputers().isEmpty()) {
            System.out.println("Liste Boş");
        } else {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.format("| %-2s | %-10s | %-10s | %-10s | %-10s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s |%n",
                    "ID","Ürün","Marka","Fiyat","İndirim","Stok","Hafıza","Ekran","Ram","Batarya","Renk");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            for (Computer computer : getComputers()) {
                System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d | %-7d | %-5s |%n",
                        computer.getId(),
                        computer.getProductName(),
                        computer.getBrandName(),
                        computer.getUnitPrice(),
                        computer.getDiscountRate(),
                        computer.getAmountStock(),
                        computer.getMemory(),
                        computer.getScreenSize(),
                        computer.getRam(),
                        computer.getBatteryPower(),
                        computer.getColor());
                System.out.println("-------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    public void findById() {
        boolean isFound = false;

        System.out.print("Lütfen bulmak istediğiniz kaydın ID değerini girin : ");
        Integer id = scanner.nextInt();

        for (Computer computer : getComputers()) {
            if (computer.getId().equals(id)) {
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d | %-7d | %-5s |%n",
                        computer.getId(),
                        computer.getProductName(),
                        computer.getBrandName(),
                        computer.getUnitPrice(),
                        computer.getDiscountRate(),
                        computer.getAmountStock(),
                        computer.getMemory(),
                        computer.getScreenSize(),
                        computer.getRam(),
                        computer.getBatteryPower(),
                        computer.getColor());
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("id'si " + id + " olan bir ürün kaydı bulunmamaktadır.");
        }
    }
    public void findByBrand() {
        if (getComputers().isEmpty()) {
            System.out.println("Liste boş");
        } else {
            String findBrand = Product.selectBrand();
            boolean isFound = false;

            for (Computer computer : getComputers()) {
                if (computer.getBrandName().equals(findBrand)) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.format("| %-2d | %-10s | %-10s | %-10d | %-10.2f | %-5d | %-6d | %-5.2f | %-5d | %-7d | %-5s |%n",
                            computer.getId(),
                            computer.getProductName(),
                            computer.getBrandName(),
                            computer.getUnitPrice(),
                            computer.getDiscountRate(),
                            computer.getAmountStock(),
                            computer.getMemory(),
                            computer.getScreenSize(),
                            computer.getRam(),
                            computer.getBatteryPower(),
                            computer.getColor());
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    isFound = true;
                }
            }

            if (!isFound) {
                System.out.println("Seçilen markaya ait kayıt bulunamadı");
            }
        }
    }


    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public Integer getComputerId() {
        return computerId;
    }

    public void setComputerId(Integer computerId) {
        this.computerId = computerId;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

