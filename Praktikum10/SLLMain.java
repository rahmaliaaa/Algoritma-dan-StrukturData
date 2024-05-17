package Praktikum10;

public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(100);
        myLinkedList.print();
        myLinkedList.addLast(200);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();
        myLinkedList.insertAt(2, 200);
        myLinkedList.print();

        System.out.println("Data pada index ke-1: " + myLinkedList.getData(5));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
    }
}
