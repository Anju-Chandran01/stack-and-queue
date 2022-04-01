package com.bridgelabz.stackandqueue;

import static java.lang.System.exit;

public class StackLinkedList {

    private static class Node {
        int data;
        Node link;
    }

    Node top;
    StackLinkedList() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    // check empty function
    public boolean isEmpty() {
        return top == null;
    }

    // return top element in a stack
    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }



    // pop top element from the stack
    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }

    public void display() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}
