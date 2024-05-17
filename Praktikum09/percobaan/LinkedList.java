package percobaan;
public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list : ");
            Node curretNode = head;

            while (curretNode != null) {
                System.out.print(curretNode.data + "\t");
                curretNode = curretNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void addFirst(int input) {
        Node newNode = new Node(input);
        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input){
        Node newNode = new Node(input);

        if (isEmpty()){
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter(int key, int input) {
        Node newNode = new Node(input);

        if (!isEmpty()){
            Node currentNode = head;

            do {
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
    public void insertBefore(int key, int input) {
        Node newNode = new Node(input);
    
        if (!isEmpty()) {
            if (head.data == key) {
                addFirst(input);
            } else {
                Node currentNode = head;
    
                while (currentNode.next != null) {
                    if (currentNode.next.data == key) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
    
    public void insertAt(int index, int key) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
    
        Node newNode = new Node(key);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            if (current == null) {
                System.out.println("Index melebihi panjang linked list");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
    
        if (index == 0) {
            head = head.next;
            return;
        }
    
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        if (current == null || current.next == null) {
            System.out.println("Index melebihi panjang linked list");
            return;
        }
        current.next = current.next.next;
    }
    
    public int getData(int index) { //modifikasi nomor 3
        if (index < 0) {
            System.out.println("Index tidak valid: " + index);
            return -1; // Nilai default atau sesuaikan dengan kebutuhan
        }
    
        Node currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentNode == null) {
            System.out.println("Index melebihi panjang linked list");
            return -1; // Nilai default atau sesuaikan dengan kebutuhan
        }
        return currentNode.data;
    }
    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null){
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void remove(int key){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
}

