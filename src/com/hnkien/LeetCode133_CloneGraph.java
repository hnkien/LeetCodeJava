package com.hnkien;
//https://leetcode.com/problems/clone-graph/
//Given a reference of a node in a connected undirected graph.
//        Return a deep copy (clone) of the graph.
//        Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
//
//class Node {
//    public int val;
//    public List<Node> neighbors;
//}
//
//Test case format:
//        For simplicity, each node's value is the same as the node's index (1-indexed).
//        For example, the first node with val == 1, the second node with val == 2, and so on.
//        The graph is represented in the test case using an adjacency list.
//        An adjacency list is a collection of unordered lists used to represent a finite graph.
//        Each list describes the set of neighbors of a node in the graph.
//        The given node will always be the first node with val = 1.
//        You must return the copy of the given node as a reference to the cloned graph.

//        Example 1:
//        Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
//        Output: [[2,4],[1,3],[2,4],[1,3]]
//        Explanation: There are 4 nodes in the graph.
//        1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//        2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
//        3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//        4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).

//        Example 2:
//        Input: adjList = [[]]
//        Output: [[]]
//        Explanation: Note that the input contains one empty list.
//        The graph consists of only one node with val = 1 and it does not have any neighbors.

//        Example 3:
//        Input: adjList = []
//        Output: []
//        Explanation: This an empty graph, it does not have any nodes.

//        Example 4:
//        Input: adjList = [[2],[1]]
//        Output: [[2],[1]]
//
//        Constraints:
//        The number of nodes in the graph is in the range [0, 100].
//        1 <= Node.val <= 100
//        Node.val is unique for each node.
//        There are no repeated edges and no self-loops in the graph.
//        The Graph is connected and all nodes can be visited starting from the given node.

import java.util.*;

public class LeetCode133_CloneGraph {
    class GraphNode {
        int val;
        // A neighbour Vector which contains references to
        // all the neighbours of a GraphNode
        Vector<GraphNode> neighbours;

        public GraphNode(int val) {
            this.val = val;
            neighbours = new Vector<GraphNode>();
        }
    }

    // A method which clones the graph and
    // returns the reference of new cloned source node
    public GraphNode cloneGraph(GraphNode source) {
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(source);
        // An HashMap to keep track of all the
        // nodes which have already been created
        HashMap<GraphNode, GraphNode> hm =
                new HashMap<GraphNode, GraphNode>();
        //Put the node into the HashMap
        hm.put(source, new GraphNode(source.val));
        while (!q.isEmpty()) {
            // Get the front node from the queue
            // and then visit all its neighbours
            GraphNode u = q.poll();
            // Get corresponding Cloned Graph Node
            GraphNode cloneNodeU = hm.get(u);
            if (u.neighbours != null) {
                Vector<GraphNode> v = u.neighbours;
                for (GraphNode graphNode : v) {
                    // Get the corresponding cloned node
                    // If the node is not cloned then we will
                    // simply get a null
                    GraphNode cloneNodeG = hm.get(graphNode);
                    // Check if this node has already been created
                    if (cloneNodeG == null) {
                        q.add(graphNode);
                        // If not then create a new Node and
                        // put into the HashMap
                        cloneNodeG = new GraphNode(graphNode.val);
                        hm.put(graphNode, cloneNodeG);
                    }
                    // add the 'cloneNodeG' to neighbour
                    // vector of the cloneNodeG
                    cloneNodeU.neighbours.add(cloneNodeG);
                }
            }
        }
        // Return the reference of cloned source Node
        return hm.get(source);
    }

    // Build the desired graph
    public GraphNode buildGraph() {
        /*
            Note : All the edges are Undirected
            Given Graph:
            1--2
            |  |
            4--3
        */
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        Vector<GraphNode> v = new Vector<GraphNode>();
        v.add(node2);
        v.add(node4);
        node1.neighbours = v;
        v = new Vector<GraphNode>();
        v.add(node1);
        v.add(node3);
        node2.neighbours = v;
        v = new Vector<GraphNode>();
        v.add(node2);
        v.add(node4);
        node3.neighbours = v;
        v = new Vector<GraphNode>();
        v.add(node3);
        v.add(node1);
        node4.neighbours = v;
        return node1;
    }

    // DFS traversal of a graph using Stack
    public void dfs(GraphNode source) {
        Stack<GraphNode> stack = new Stack<>();
        HashMap<GraphNode, Boolean> visit =
                new HashMap<GraphNode, Boolean>();
        if (source == null) return;
        stack.push(source);
        while (!stack.isEmpty()) {
            GraphNode s = stack.pop();
            if (!visit.containsKey(s) || !visit.get(s)) {
                visit.put(s, true);
                System.out.print(String.valueOf(s.val) + " ");
                for (GraphNode node : s.neighbours) stack.push(node);
            }
        }
    }

    // BFS traversal of a graph to
    // check if the cloned graph is correct
    public void bfs(GraphNode source) {
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(source);
        HashMap<GraphNode, Boolean> visit =
                new HashMap<GraphNode, Boolean>();
        visit.put(source, true);
        while (!q.isEmpty()) {
            GraphNode u = q.poll();
            System.out.print(u.val + " ");
//            System.out.println("Address of Node " + u);
            if (u.neighbours != null) {
                Vector<GraphNode> v = u.neighbours;
                for (GraphNode g : v) {
                    if (visit.get(g) == null) {
                        q.add(g);
                        visit.put(g, true);
                    }
                }
            }
        }
        System.out.println();
    }

    public static void runTest() {
        LeetCode133_CloneGraph graph = new LeetCode133_CloneGraph();
        GraphNode source = graph.buildGraph();
        System.out.println("BFS traversal of a graph before cloning");
        graph.bfs(source);
        GraphNode newSource = graph.cloneGraph(source);
        System.out.println("BFS traversal of a graph after cloning");
        graph.bfs(newSource);
        System.out.println("DFS traversal of a graph after cloning");
        graph.dfs(newSource);
    }
}
