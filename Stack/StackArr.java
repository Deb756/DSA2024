package Stack;

public class StackArr {
    int arr[];
    int top;

    StackArr(int size) {
        arr = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack is Full for val : " + val);
            return;
        }
        arr[++top] = val;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int elem = arr[top];
        top--;
        return elem;
    }

    int peek() {
        return isEmpty() ? -1 : arr[top];
    }

    // void display()
    // {
    // while (!isEmpty()) {
    // System.out.print(arr[top] + " ");
    // top--;
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        StackArr st = new StackArr(5);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(99);

        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        // st.display();
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
