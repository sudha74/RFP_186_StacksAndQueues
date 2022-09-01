package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<T> {
    LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }


    public void push(T key) {
        linkedList.push(key);
    }


    public void print() {
        linkedList.display();
    }

    public T pop() {
        return linkedList.pop();
    }

    public T peek() {
        return linkedList.peek();
    }

    public boolean isEmpty() {
        if (linkedList.size() == 0)
            return true;
        else
            return false;
    }
}
