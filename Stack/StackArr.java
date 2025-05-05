package Stack;

class StackN {
    int size;
    int top;
    int arr[];
}

public class StackArr {
    private StackN head;

    public boolean isEmpty() {
        if (head.top == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (head.top == head.size - 1)
            return true;
        return false;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full ");
            return;
        }
        head.top++;
        head.arr[head.top] = data;
    }

    public int pack(int i) {
        int idx = head.top - i + 1;
        if (idx < 0)
            return -1;
        else {
            return head.arr[idx];
        }
    }


    public static void main(String[] args) {

    }
}
