package com.bridgelabz.stackandqueue;

public class StackMain {
    public static void main(String[] args) {

        // create Object of Implementing class
        StackLinkedList obj = new StackLinkedList();

        // insert Stack value
        obj.push(70);
        obj.push(30);
        obj.push(56);
        
        // print Stack elements
        obj.display();

    }
}
