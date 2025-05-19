package Queue;

import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionFreameWork {
    public static void main(String[] args) {
        // Queue<E> interface is implemented to 2 classes i.e [ArrayDeque<>()] and [LinkedList<>()]
        //  [ArrayDeque<>()] -> also known as double-endedQueue mean we can add() and remove() from both ends
        Queue<Integer> q = new ArrayDeque<>();
        // Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q);
    }
}
