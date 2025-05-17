package Queue;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private ListNode front = null;
    private ListNode rear = null;

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (isEmpty())
            return -1;
        int elem = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return elem;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("OUT <- ");
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(" <- IN");
        System.out.println();
    }

    int peek() {
        if (isEmpty())
            return -1;
        return front.data;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.display();
        System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.isEmpty());

    }
}
