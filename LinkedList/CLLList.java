package LinkedList;

public class CLLList {
    private CLLNode head;
    private CLLNode tail;

    public CLLList() {
        this.head = null;
        this.tail = null;
    }

    // insert at bigining
    public void insertAtBegin(int data) {
        CLLNode newNode = new CLLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void insertLast(int data) {
        CLLNode newNode = new CLLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        CLLNode temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.print("head");
        }
    }

    public static void main(String[] args) {
        CLLList cList = new CLLList();
        cList.insertAtBegin(4);
        cList.insertAtBegin(3);

        // at last
        cList.insertLast(55);
        cList.insertLast(89);
        cList.insertAtBegin(6);
        cList.display();
    }
}
