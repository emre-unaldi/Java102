package PatikaStore;

import java.util.Scanner;

public class Product {
    private static Scanner scanner = new Scanner(System.in);
    private Integer id;
    private Integer unitPrice;
    private Float discountRate;
    private Integer amountStock;
    private String productName;
    private String brandName;
    private Integer memory;
    private Double screenSize;
    private Integer ram;

    public Product(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Double screenSize, Integer ram) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountStock = amountStock;
        this.productName = productName;
        this.brandName = brandName;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Product(){}

    public static String selectBrand() {
        Brand brand = new Brand();
        StringBuilder builder = new StringBuilder();
        builder.append("| ");

        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("| %-4s\t | %-4s\t | %-4s\t | %-4s\t | %-4s\t | %-4s\t | %-4s\t | %-4s\t | %-4s\t |%n",
                "1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ");
        System.out.println("-----------------------------------------------------------------------------");

        for (String item : brand.getBrands().values()) {
            builder.append(item).append(" | ");
        }
        System.out.println(builder);
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Bir marka seçiniz : ");
        Integer selectedBrandId = scanner.nextInt();

        return brand.findBrandById(selectedBrandId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Float discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getAmountStock() {
        return amountStock;
    }

    public void setAmountStock(Integer amountStock) {
        this.amountStock = amountStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
}

