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
        System.out.println();
        myDLL.reversePrint();
        myDLL.removeFirst();
        myDLL.print();
        myDLL.reversePrint();
        myDLL.removeLast();
        System.out.println();
        myDLL.print();
        myDLL.getData(2);
        myDLL.addLast(800);
        System.out.println("Data pada index 1: " +myDLL.getData(1));
        myDLL.addLast(500);
        System.out.println("Indeks dari data 500: " + myDLL.indexOf(500));
        System.out.println();
    }
}
