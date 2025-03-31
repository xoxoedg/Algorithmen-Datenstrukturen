package datastructures;


public class StackAr {

    private int[] arr;
    private int top;
    private int capacatiy;

    StackAr(int size) {
        this.arr = new int[size];
        this.capacatiy = size;
        this.top = -1;
    }

    private void push(int value) {
        if (top == capacatiy - 1) {
            System.out.print("Stack is full");
        } else {
            arr[++top] = value;
        }
    }

    private int pop(int value) {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top--];
        }
    }

    private int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    private boolean isEmpy() {
        return top < 0;
    }
}
