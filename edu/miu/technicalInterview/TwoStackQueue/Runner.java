package edu.miu.technicalInterview.TwoStackQueue;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(2);
        q.enQueue(1);
        q.enQueue(8);

        q.deQueue();
        q.deQueue();

        q.displayElement();

        Stack stack = new Stack(5);
        stack.push(90);
        stack.push(2);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(81);
        stack.displayStack();
    }
}
