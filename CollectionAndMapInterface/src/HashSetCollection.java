
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(10);
        // Benzersiz değerleri içerdiği için eklense de listelenmez dahil etmez.
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(null);
        // null değer atanabilir.

        for (Integer sayi : hashSet) {
            System.out.println(sayi);
        }
        // Girilen sırada lsitelenmez sıralama değişebilir. 20,10,30 olarak çıktı,
        // Çünkü hash değerlerine göre sıralanır.

        hashSet.remove(10);
        // Foreach ile listeye erişim
        for (Integer sayi : hashSet) {
            System.out.println(sayi);
        }

        System.out.println("Boyut : " + hashSet.size());
        System.out.println("Liste Dolu mu Boş mu ? " + hashSet.isEmpty());
        System.out.println("20 değeri var mı ? " + hashSet.contains(20));
        //hashSet.clear(); // Komple içeriğini siler

        // Iterator ile listeyi gezerek erişim
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) { // hasNext() -> Bir sonraki eleman var mı ? kontrol eder
            System.out.println(iterator.next()); // next() -> Sonraki elemanı getirir.
        }
    }
}