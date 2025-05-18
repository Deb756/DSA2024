package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    boolean isEmpty()
    {
        return in.isEmpty();
    }
    void enqueue(int x)
    {
       while (!in.isEmpty()) {
        out.push(in.pop());
       }
       in.push(x);
       while (!out.isEmpty()) {
        in.push(out.pop());
       }
    }
    int dequeue()
    {
        if(isEmpty()) return -1;
        return in.pop();
    }
    int peek()
    {
        if(isEmpty()) return -1;
        return in.peek();
    }
    void display()
    {
        System.out.print("OUT <-");
        while (!in.isEmpty()) {
            int val = in.pop();
            System.out.print(val+" ");
            out.push(val);
        }
        System.out.print("<- IN");
        System.out.println();
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(56);
        q.display();
        q.dequeue();
        q.display();
        System.out.println(q.peek());
    }
}
