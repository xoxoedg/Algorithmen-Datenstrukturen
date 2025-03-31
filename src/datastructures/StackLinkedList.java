package datastructures;

public class StackLinkedList<T> {
    Node<T> head;

    StackLinkedList() {
        this.head = null;
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        stack.push(5);
        stack.push(9);

        stack.display();
    }

    boolean isEmpty() {
        return this.head == null;
    }

    void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    T peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }

    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            Node<T> temp = head;
            while (temp != null)  {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    T pop() {
        if (head == null) {
            throw new RuntimeException("Stack empty");
        }
        T tmp = head.data;
        head = head.next;
        return tmp;
    }
}
