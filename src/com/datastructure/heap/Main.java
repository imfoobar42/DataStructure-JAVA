package com.datastructure.heap;

public class Main {

    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(37);
        myHeap.insert(89);
        myHeap.insert(17);
        myHeap.insert(58);
        System.out.println(myHeap.getHeap());
        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
        myHeap.insert(75);
        System.out.println(myHeap.getHeap());
    }
}
//lcs
//java 8
// immediate greater no
//employee class -> list of objects -> sort -> salary-> age -> same age -> Lexicographically
//filtering, grouping
//hashmap, linkedhashset
//hashcode equals overide
//default, read safe, fail safe, fail fast
// thread notify
