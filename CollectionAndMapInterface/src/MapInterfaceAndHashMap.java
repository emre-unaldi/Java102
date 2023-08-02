import java.util.HashMap;
import java.util.Map;

public class MapInterfaceAndHashMap {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");
        country.put("USA", "ABD");

        country.replace("GR", "Stuttgart");
        System.out.println(country.get("TR"));
        country.remove("EN");
        country.size();

        // Map'ler için Iteratorler yoktur. Foreeach ile gezilir
        for (String countryKey : country.keySet()){
            System.out.println(countryKey);
        }

        System.out.println("*******************");

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }

        System.out.println("*******************");

        for (String countryKey : country.keySet()){
            System.out.println("Key : " + countryKey + " Value : " + country.get(countryKey));
        }

    }
}
