package Queue;
import java.util.*;
public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(3);
        q.add(10);
        q.add(1);
        q.add(8);
        System.out.println("Head is "+q.peek()); //print the head element of the queue
        System.out.println("Removed "+q.remove()); //remove the head element in the list and returns it,if queue is empty it returns error
        System.out.println("Remove using poll():"+q.poll()); //remove the head element and return it , gives null value if the queue is empty
        System.out.println("Size of the queue:"+q.size());
    }
}
