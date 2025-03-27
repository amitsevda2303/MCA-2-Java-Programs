// 84.	Create a program to find the shortest path in a graph using Dijkstra's algorithm.
import java.util.*;

class Graph {
    private int vertices;
    private List<List<Node>> adjList;

    static class Node implements Comparable<Node> {
        int vertex, weight;
        Node(int v, int w) { vertex = v; weight = w; }
        public int compareTo(Node other) { return Integer.compare(this.weight, other.weight); }
    }

    Graph(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) adjList.add(new ArrayList<>());
    }

    void addEdge(int u, int v, int weight) {
        adjList.get(u).add(new Node(v, weight));
        adjList.get(v).add(new Node(u, weight)); // Undirected graph
    }

    void dijkstra(int src) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex, weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < vertices; i++) System.out.println("To " + i + " -> " + dist[i]);
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 4, 5);
        g.addEdge(1, 2, 1);
        g.addEdge(1, 4, 2);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 3);

        g.dijkstra(0);
    }
}
