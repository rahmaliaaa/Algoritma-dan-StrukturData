package Praktikum07;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push("Basis data");
        myStack.push("Algoritma dan Struktur Data");
        myStack.push("Matematika");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
