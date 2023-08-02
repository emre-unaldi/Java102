import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Emre");
        list.add("Çağatay");
        list.add("Ahmet");
        list.add("Mustafa");
        list.add("Mustafa");

        // list.remove("Mustafa);
        // list.remove(2); // index

        System.out.println("Element of 2 index: " + list.get(2));
        ((LinkedList<String>) list).addFirst("Naz");

        ((LinkedList<String>) list).addLast("Ümit");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
