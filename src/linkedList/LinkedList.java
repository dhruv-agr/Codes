package linkedList;

class Node {
    int data;
    Node next;
}
public class LinkedList{
    public Node head;
    public Node addNode(Node head,int value){
        if(head == null){
            head = new Node();
            head.data = value;
            head.next = null;
        }
        else{
            Node i = head;
            while(i.next !=null){
                i = i.next;
            }
            Node newnode = new Node();
            newnode.data = value;
            i.next = newnode;
        }
        return head;
    }

    public void printLinkedList(Node head){
        Node i = head;
        while(i.next !=null){
            System.out.print(i.data +" ");
            i = i.next;
        }
        System.out.println(i.data);
    }

    public Node deleteNode(Node head, int value){
        if(head.data == value && head.next !=null){
            head = head.next;

        }
        else if(head.next !=null){
            Node i = head;
            while(i.next!=null){
                if(i.next.data == value){
                    i.next = i.next.next;
                    return head;
                }
                i=i.next;
            }

        }
        return head;
    }
}