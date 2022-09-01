package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

public class Queues<T> {

    LinkedList<T> linkedList;

    public Queues() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }

    public void print() {
        linkedList.display();
    }

    public boolean isEmpty() {
        if (linkedList.size() == 0)
            return true;
        else
            return false;
    }

    public T peek() {
        return linkedList.peek();
    }


    public T dequeue() {
        return linkedList.pop();
    }
}

