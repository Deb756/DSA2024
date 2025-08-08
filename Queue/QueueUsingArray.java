package Queue;


// it uses fifo rule
// so from (front) side it will pop element and from (rear) side it will add element
public class QueueUsingArray {
    int arr[];
    int front;
    int rear;

    QueueUsingArray(int size) {
        arr = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (rear == arr.length - 1) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full for data : "+data);
            return;
        }
        arr[rear] = data;
        rear++;
    }
    int dequeue()
    {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int elem = arr[front];
        front = front+1;
        return elem;
    }
    void display()
    {
        System.out.print("OUT<- ");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.print(" <-IN");
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.display();
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
        q.display();
    }
}
