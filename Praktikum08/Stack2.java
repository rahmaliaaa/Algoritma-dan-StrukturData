package Praktikum08;
import java.util.Scanner;

public class Stack2 {
    public int size;
    public char[] data;
    public int top;

    public Stack2(int size){
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size -1);
    }
    public void push(char dt){
        if (!isFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }
    public char pop() {
        if (isEmpty()){
            char temp = data[top];
            top--;
            return temp;
        } else {
            return '\0';
        }
    }
    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return '\0';
        }
    }
    public static boolean isOperand(char token){
        return ((token >= 'A' && token <= 'Z') || (token >= 'a' && token <= 'z') || (token >= '0' && token <= '9'));
    }
    public static boolean isOperator(char c) {
        return (c == '^' || c == '&' || c == '*' || c == '-' || c == '+');
    }
    public static int getDerajat(char c){
        switch (c) {
            case '^':
                return 3; // Pangkat memiliki prioritas tertinggi
            case '*':
            case '/':
            case '%':
                return 2; // Perkalian, pembagian, dan modulus memiliki prioritas kedua tertinggi
            case '-':
            case '+':
                return 1; // Penambahan dan pengurangan memiliki prioritas terendah
            default:
                return 0;
        }
    }      
    public static String konversi(String infix) {
        Stack2 operators = new Stack2(infix.length());
        StringBuilder postfix = new StringBuilder();
        char c;
    
        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);    
            if (isOperand(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop(); // Pop the '('
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && getDerajat(operators.peek()) >= getDerajat(c) && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.push(c);
            }
        }
        // Pop remaining operators from stack
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan :");
        String infix = sc.nextLine();
        sc.close();
        System.out.print("Infix : " + infix + " ");
        System.out.println("Postfix : " + konversi(infix));
    }
}
