package com.hnkien;
import java.util.*;

public class LeetCode133_CloneDirectedGraph {
    // Class to create a new graph node
    static class Node
    {
        int key;
        ArrayList<Node> adj = new ArrayList<Node>();

        // key is the value of the node
        // adj will be holding a dynamic
        // list of all Node type neighboring
        // nodes
        Node(int key)
        {
            this.key = key;
        }
    }

    // Function to print a graph,
// depth-wise, recursively
    static void printGraph(Node startNode,
                           boolean[] visited)
    {

        // Visit only those nodes who have any
        // neighboring nodes to be traversed
        if (!startNode.adj.isEmpty())
        {
            // Loop through the neighboring nodes
            // of this node. If source node not already
            // visited, print edge from source to
            // neighboring nodes. After visiting all
            // neighbors of source node, mark its visited
            // flag to true
            for(Node i : startNode.adj)
            {
                if (!visited[startNode.key])
                {
                    System.out.println("edge " + startNode +
                            "-" + i + ":" + startNode.key +
                            "-" + i.key);

                    if (!visited[i.key])
                    {
                        printGraph(i, visited);
                        visited[i.key] = true;
                    }
                }
            }
        }
    }

    // Function to clone a graph. To do this, we
// start reading the original graph depth-wise,
// recursively. If we encounter an unvisited
// node in original graph, we initialize a
// new instance of Node for cloned graph with
// key of original node
    static Node cloneGraph(Node oldSource,
                           Node newSource,
                           boolean[] visited)
    {
        Node clone = null;
        if (!visited[oldSource.key] &&
                !oldSource.adj.isEmpty())
        {
            for(Node old : oldSource.adj)
            {
                // Below check is for backtracking, so new
                // nodes don't get initialized everytime
                if (clone == null ||
                        (clone != null &&
                                clone.key != old.key))
                    clone = new Node(old.key);

                newSource.adj.add(clone);
                cloneGraph(old, clone, visited);
                // Once, all neighbors for that particular node
                // are created in cloned graph, code backtracks
                // and exits from that node, mark the node as
                // visited in original graph, and traverse the
                // next unvisited
                visited[old.key] = true;
            }
        }
        return newSource;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n0.adj.add(n1);
        n0.adj.add(n2);
        n1.adj.add(n2);
        n1.adj.add(n3);
        n1.adj.add(n4);
        n2.adj.add(n3);
        n3.adj.add(n4);

        // Flag to check if a node is already visited.
        // Stops indefinite looping during recursion
        boolean visited[] = new boolean[5];
        System.out.println("Graph Before Cloning:-");
        printGraph(n0, visited);
        Arrays.fill(visited, false);

        System.out.println("\nCloning Process Starts");
        Node clonedGraphHead = cloneGraph(
                n0, new Node(n0.key), visited);
        System.out.println("Cloning Process Completes.");

        Arrays.fill(visited, false);
        System.out.println("\nGraph After Cloning:-");
        printGraph(clonedGraphHead, visited);
    }
}
