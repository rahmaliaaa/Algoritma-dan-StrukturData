package Praktikum10;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list : ");
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
    public void reversePrint(){
        if (!isEmpty()){
            System.out.print("Isi Linked list: ");
            Node currentNode = tail;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.prev;
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
    public int getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong atau index tidak valid");
        }
    
        Node currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentNode == null) {
            System.out.println("Index tidak ditemukan");
            return -1;
        }
        return currentNode.data;
    }
    public int indexOf(int data) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return -1;
        }
        Node currentNode = head;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentIndex;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        System.out.println("Data tidak ditemukan");
        return -1;
    }
    public void insertAfter(int key, int input) { //soal tugas nomor 3
        Node newNode = new Node(input);

        if (!isEmpty()) {
            Node currentNode = head;

            while (currentNode != null) {
                if (currentNode.data == key) {
                    if (currentNode == tail) {
                        addLast(input);
                    } else {
                        newNode.next = currentNode.next;
                        newNode.prev = currentNode;
                        currentNode.next.prev = newNode;
                        currentNode.next = newNode;
                    }
                    break;
                }
                currentNode = currentNode.next;
            }
        } else {
            System.out.print("Linked list kosong");
        }
    }
}

