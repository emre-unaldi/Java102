import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("Kayseri");
        vector.add("Mersin");

        vector.add(2, "Kahramanmaraş");

        System.out.println("Vektör Uzunluğu : " + vector.size());

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Vektör öğesi : " + i + " : " + vector.get(i));
        }
    }
}
