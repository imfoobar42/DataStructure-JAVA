package com.datastructure.graph;

import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdges("B","C");
        myGraph.addVertex("F");
        myGraph.addEdges("A","E");
        myGraph.printGraph();
    }
}
