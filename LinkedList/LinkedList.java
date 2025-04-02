package LinkedList;

public class LinkedList {
    // pointing to the head of node
    // this is the entry point to list so this shiold be added always
    private Node head;

    // Add at begining
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // delete at beginging
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // delete at Last
    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        while (secondLastNode.next.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    // delete by value
    public void removeValue(int val) {
        if (head == null) {
            return;
        }
        while (head != null && head.data == val) {
            head = head.next;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {

            if (temp.next.data == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    // printing / Traversing the LinkedList
    public void display() {
        // we always need a temp node to traver through LinkedList bcz we cant move Head
        // its constant
        // we entry to LL through this
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(6);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(6);
        list.addFirst(6);

        // // add at end
        // list.addLast(100);

        // // remove at begining
        // list.removeFirst();
        // // remove at Last
        // list.removeLast();

        // delete by val
        list.removeValue(6);

        list.display();
    }
}
