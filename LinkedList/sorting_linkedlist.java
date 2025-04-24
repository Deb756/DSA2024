package LinkedList;

public class sorting_linkedlist {
    public void sort(Node list){
        Node head = new Node(list.data);
        head.next = list.next;
        Node temp = new Node(0);

        list = list.next;

        while(list.next !=  null ){
            if(list.data<head.data){
                temp.data = list.data;
                temp.next = list.next;

                list.data = head.data;
                list.next = head.next;

                head.data = temp.data;
                head.next = temp.next;
                
            }
            list = list.next;
        }
    }
}
