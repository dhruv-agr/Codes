import linkedList.LinkedList;
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        LinkedList ll = new LinkedList();
        ll.head = ll.addNode(ll.head,1);
        ll.head = ll.addNode(ll.head,2);
        ll.head = ll.addNode(ll.head,3);
        ll.head = ll.addNode(ll.head,4);
        ll.head = ll.addNode(ll.head,5);
        ll.head = ll.addNode(ll.head,6);
        ll.printLinkedList(ll.head);
        ll.head = ll.deleteNode(ll.head,6);
        ll.printLinkedList(ll.head);


    }
}

