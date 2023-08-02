import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        queue.add("Emre");
        queue.add("Mustafa");
        queue.add("Mehmet");
        queue.add("Serkan");

        System.out.println(queue.poll());
        System.out.println(queue.element());

        System.out.println("****************");

        for (String item : queue){
            System.out.println(item);
        }

        System.out.println("****************");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
