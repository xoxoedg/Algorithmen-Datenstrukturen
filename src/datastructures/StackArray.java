package datastructures;

import java.util.Stack;

public class StackArray extends Stack {

    int top;
    Object[] stack;

    StackArray(int capacity) {
        top = 0;
        stack = new Object[capacity];
    }

    public Object push(Object o) {

        return o;
    }
}
