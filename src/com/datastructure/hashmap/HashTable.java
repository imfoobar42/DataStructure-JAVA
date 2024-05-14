package com.datastructure.hashmap;

public class HashTable {
    private int size = 7;
    private Node dataMap[];

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }
    //hashing method

    private int hash(String key) {
        int hash = 0;
        char[] charArray = key.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int asciiValue = charArray[i];
            hash = (hash + asciiValue * 57);
        }
        hash %= dataMap.length;
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            System.out.println(i + ":");
            while (temp != null) {
                System.out.println("{" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }

        }
    }

    //Set value
    //set Value
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        // Node temp;
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp != null) {
                temp = temp.next;
            }
            temp = newNode;
        }
    }

    //Get Method
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }
}
