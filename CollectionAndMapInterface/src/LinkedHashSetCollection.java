import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);

        for (Integer item : linkedHashSet) {
            System.out.println(item);
        }

        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*
            LinkedHashSet, girilen verileri oluğu sırada yazdırır. Çünkü birbirlerine bağlar.
            HashSet'ten farkı budur.Sıralama önemli olduğunda LinkedHashSet kullanılır.
        */
    }
}