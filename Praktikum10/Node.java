package Praktikum10;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) { //konstruktor
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
