package Praktikum10;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();
        myDLL.print();
        myDLL.addFirst(800);
        myDLL.print();
        myDLL.addFirst(700);
        myDLL.print();
        myDLL.addLast(500);
        myDLL.print();
        myDLL.removeFirst();
        myDLL.print();
        myDLL.removeLast();
        myDLL.print();
    }
}
