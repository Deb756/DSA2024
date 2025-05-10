package LinkedList;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    private node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void addAtIndex(int index, int val) {
        node newNode = new node(val);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 0;
        node curr = head;
        while (curr != null && count < index - 1) {
            count++;
            curr = curr.next;
        }
        // if out of bound index
        if (curr == null)
            return;
        newNode.next = curr.next;
        curr.next = newNode;

    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head != null)
                head = head.next;
            return;
        }
        node curr = head;
        int count = 0;
        while (curr != null && count < index - 1) {
            count++;
            curr = curr.next;
        }
        if (curr == null || curr.next == null)
            return;
        curr.next = curr.next.next;
    }

    public static void main(String[] args) {
        // here we can create object of class a do operations
    }
}

public class DesignLinkedListLeetCode {
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
