package com.datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList> adjList= new HashMap<>();

    //Print Graph
    public void printGraph(){
        System.out.println(adjList);
    }

    //Add vertex method
    public  boolean addVertex(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex,new ArrayList<>());
            return true;
        }
        return false;

    }

    //Add Edges
    public boolean addEdges(String vertex1, String vertex2){
    if (adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
        return  true;
    }
        return false;
    }
}
