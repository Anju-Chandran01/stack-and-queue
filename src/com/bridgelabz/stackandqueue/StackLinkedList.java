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

    public void display() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println( temp.data);
                temp = temp.link;
            }
        }
    }
}
