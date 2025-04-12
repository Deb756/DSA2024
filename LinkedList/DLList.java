package LinkedList;

public class DLList {
    private DLLNode head;

    public void insertAtBegin(int data) {
        DLLNode newNode = new DLLNode(data);
        // adding at first
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = newNode;
        }
        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        newNode.prev = temp;
    }

    // diplay in reverse
    public void diplayREV() {
        DLLNode temp = head;
        DLLNode last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        // rev printing
        System.out.print("NULL");
        while (last != null) {
            System.out.print("<- " + last.data + " ->");
            last = last.prev;
        }
        System.out.print("NULL");
    }

    // display
    public void display() {
        DLLNode temp = head;
        System.out.print("NULL");
        while (temp != null) {
            System.out.print("<- " + temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        DLList dList = new DLList();

        // insert at begin
        // dList.insertAtBegin(4);
        dList.insertAtBegin(99);
        // dList.insertAtBegin(2);

        // at END
        dList.insertLast(2);
        dList.insertLast(3);
        dList.insertLast(4);

        dList.display();
        System.out.println();
        // printing in REVERSE
        // dList.diplayREV();

    }

}
