import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListCollection {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Emre");
        queue.add("Mustafa");
        queue.add("Ahmet");

        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.remove();

        System.out.println("****************");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
