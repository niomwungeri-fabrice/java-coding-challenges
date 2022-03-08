package edu.miu.technicalInterview.TwoStackQueue;

public class Queue {
    int queue[] = new int[5];
    int size, front, rear;

    public void enQueue(int item) {
        queue[rear] = item;
        rear++;
        size++;
    }

    public int deQueue() {
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void displayElement() {

        for (int i = 0; i < size; i++) {
            System.out.println(queue[front + i] + " ");
        }

    }

}
