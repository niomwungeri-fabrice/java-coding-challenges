package edu.miu.technicalInterview.TwoStackQueue;

import java.util.Arrays;

public class Stack {

    private int a[];
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.a = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int item) {
        if (top == capacity - 1)
            throw new RuntimeException("The Stack is Full");
        a[++top] = item;
    }

    public int pop() {
        if (top == -1)
            throw new RuntimeException("The Stack is Empty");
        a[top] = 0;
        return a[top--];
    }

    public int peek() {
        return a[top];
    }

    public void displayStack() {
        System.out.println(Arrays.toString(a));
    }

}
