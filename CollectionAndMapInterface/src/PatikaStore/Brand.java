package PatikaStore;

import java.util.HashMap;
import java.util.Map;

public class Brand {
    private Integer id;
    private String name;
    private Map<Integer, String> brands = new HashMap<>();
    private String[] brandList = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};

    public Brand(){
        this.defineBrands();
    }

    public void defineBrands() {
        int count = 1;
        for (String item : getBrandList()) {
            getBrands().put(count++, item);
        }
    }

    public void displayBrands() {
        for (Integer item : getBrands().keySet()) {
            System.out.println(item + " : " + getBrands().get(item));
        }

        Store.start();
    }

    public String findBrandById(Integer id) {
        return brands.get(id);
    };

    public Map<Integer, String> getBrands() {
        return brands;
    }

    public String[] getBrandList() {
        return brandList;
    }
}

