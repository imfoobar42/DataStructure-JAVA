package com.datastructure.stack;

public class Stack {
    private int height;
    private Node top;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void push(int value){
        Node temp = new Node(value);
        if(height==0){
         top = temp;
        }
        else{
            temp.next = top;
            top = temp;
        }
        ++height;
    }
}
