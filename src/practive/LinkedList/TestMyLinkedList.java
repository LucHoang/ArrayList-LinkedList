package practive.LinkedList;

import practive.LinkedList.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,15);
        ll.add(4,11);
        ll.add(4,12);
        ll.printList();
    }
}
