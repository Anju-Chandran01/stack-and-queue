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

        //peek() and pop()
        if (obj.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("After peek");
            System.out.println(obj.peek());
            obj.pop();
            System.out.println("The final stack is : ");
            obj.display();
        }
    }
}
