import java.util.ArrayList;
import java.util.Comparator;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(89);
        arrayList.add(25);
        arrayList.add(44);
        arrayList.add(100);
        arrayList.add(7);
        arrayList.add(63);

        //arrayList.stream().forEach(i -> System.out.println(i));
        //arrayList.forEach(i -> System.out.println(i));
        //arrayList.stream().filter(num -> num > 60).forEach(i -> System.out.println(i));
        //arrayList.stream().distinct().forEach(i -> System.out.println(i));
        //arrayList.stream().sorted().forEach(i -> System.out.println(i));
        //arrayList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
        //arrayList.stream().limit(5).forEach(i -> System.out.println(i));
        //arrayList.stream().skip(3).forEach(i -> System.out.println(i));
        //long a = arrayList.stream().count();
        //System.out.println(a);
        // anyMatch(), allMatch(), noneMatch()
    }
}
