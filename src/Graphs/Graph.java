package Graphs;

import java.util.*;

public class Graph {
    int numOfVertices;
    LinkedList<Integer> adjList[];
    Graph(int numOfVertices){
        this.numOfVertices = numOfVertices;
       adjList = new LinkedList[numOfVertices];
       for(int i=0; i<numOfVertices; i++){
           adjList[i] = new LinkedList<>();
       }

    }
    public void addEdge(int u, int v){
        this.adjList[u].add(v);
    }
    public void bfs(int startNode){
        Queue<Integer> queue= new LinkedList<>();
        HashMap<Integer,Boolean> visited = new HashMap();
        queue.add(startNode);
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            visited.put(currentNode,true);
            System.out.println(currentNode + " ");

            for(int neighbor : adjList[currentNode]){
                if(visited.get(neighbor) == null)  {
                    visited.put(neighbor,false);
                    queue.add(neighbor);
                }
            }
            //System.out.println("visited is : " + visited.toString());
            //System.out.println("queue is: " +queue.toString());
        }


    }
}
