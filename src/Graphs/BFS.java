package Graphs;
import java.util.*;
public class BFS {

    public static void main(String[] args) {
        System.out.println("BFS called" );
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.bfs(0);

    }



}
