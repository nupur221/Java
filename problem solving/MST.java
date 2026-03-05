import java.util.*;
class Edge {
    char source, destination;
    int weight;

    Edge(char source, char destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
class Graph {
    int V, E;
    ArrayList<Edge> edges;
    Map<Character, Character> parent;
    Graph(int v, int e) {
        V = v;
        E = e;
        edges = new ArrayList<>();
        parent = new HashMap<>();
    }
    void addEdge(char src, char dest, int weight) {
        edges.add(new Edge(src, dest, weight));
        parent.put(src, src);
        parent.put(dest, dest);
    }
    ArrayList<Edge> kruskalMST() {
        ArrayList<Edge> result = new ArrayList<>();
        Collections.sort(edges, Comparator.comparingInt(o -> o.weight));
        int edgeCount = 0;
        int i = 0;

        while (edgeCount < V - 1) {
            Edge nextEdge = edges.get(i++);
            char x = find(nextEdge.source);
            char y = find(nextEdge.destination);

            if (x != y) {
                result.add(nextEdge);
                union(x, y);
                edgeCount++;
            }
        }
        return result;
    }
    char find(char vertex) {
        if (vertex != parent.get(vertex)) {
            parent.put(vertex, find(parent.get(vertex)));
        }
        return parent.get(vertex);
    }
    void union(char x, char y) {
        parent.put(find(x), find(y));
    }
}

public class MST {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int V, E;
            System.out.print("Enter the number of vertices: ");
            V = input.nextInt();
            System.out.print("Enter the number of edges: ");
            E = input.nextInt();

            Graph graph = new Graph(V, E);
            System.out.println("Enter edges (source, destination, weight):");
            for (int i = 0; i < E; i++) {
                char src = input.next().charAt(0);
                char dest = input.next().charAt(0);
                int weight = input.nextInt();
                graph.addEdge(src, dest, weight);
            }

            ArrayList<Edge> MST = graph.kruskalMST();

            System.out.println("The Minimum Spanning Tree Path:");
            int totalWeight = 0;
            for (Edge edge : MST) {
                System.out.println(edge.source + " --> " + edge.destination + " : " + edge.weight);
                totalWeight += edge.weight;
            }
            System.out.println("\nMinimum Cost: " + totalWeight);
        
    }
}

