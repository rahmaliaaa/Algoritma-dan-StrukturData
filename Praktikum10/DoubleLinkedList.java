package Praktikum10;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;
    
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input){
        Node newNode = new Node(input);
    
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(int input){
        Node newNode = new Node(input);
    
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head == tail){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if (head == null){
            System.out.println("Linked list kosong");
        } else if (head == tail){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}

