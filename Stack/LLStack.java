package Stack;

public class LLStack {
    int data;
    LLStack next;

    LLStack(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private LLStack head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        LLStack newNode = new LLStack(data);
        if (isEmpty()) {
            // newNode.next = head;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return head.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ;
        }
        LLStack temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(7);
        // s.push(6);
        // s.push(8);

        System.err.println("Peek is = "+s.peek());
        s.pop();
        System.err.println("Peek is = "+s.peek());
        s.display();
    }
}
