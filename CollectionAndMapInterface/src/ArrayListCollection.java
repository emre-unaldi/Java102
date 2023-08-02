import java.util.*;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");
        nameList.add(null);

        System.out.println(nameList);
        System.out.println("Size of list: " + nameList.size());
        System.out.println("Element of 1 index: " + nameList.get(1));
        System.out.println("Element of 2 index: " + nameList.get(2));
        System.out.println("Index of 'Umut': " + nameList.indexOf("Umut"));
        System.out.println("Index of 'Umut': " + nameList.lastIndexOf("Umut"));

        nameList.add(3, "Zeynep");

        nameList.set(1, "Naz");

        System.out.println(nameList.contains("Elif"));
        System.out.println(nameList.contains("Mustafa"));

        String firstElement = nameList.remove(0);
        System.out.println(firstElement + " is removed from list!");


        List<String> newNameList = new ArrayList<String>();
        newNameList.add("Batuhan");
        newNameList.add("Kemal");

        nameList.addAll(newNameList);

        List<String> subList = nameList.subList(4, 6);

        System.out.println("Sublist from name list");
        System.out.println(subList);


        Object[] objectArray = nameList.toArray();

        String[] stringArray = nameList.toArray(new String[0]);

        nameList.clear();
    }
}
