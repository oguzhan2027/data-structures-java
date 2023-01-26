import java.util.*;

class Edge {
    int src, dest, weight;
}

class Graph {
    int V, E;
    Edge[] edge;

    Graph(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void Union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {
        Edge[] result = new Edge[V];
        int[] parent = new int[V];
        for (int i = 0; i < V; ++i)
            parent[i] = -1;
        Arrays.sort(edge, (a, b) -> a.weight - b.weight);
        int e = 0, i = 0;
        while (e < V - 1) {
            Edge next_edge = new Edge();
            next_edge = edge[i++];
            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);
            if (x != y) {
                result[e++] = next_edge;
                Union(parent, x, y);
            }
        }
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
    }
}

public class Kruskal {
    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        Graph graph = new Graph(V, E);
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;

        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;

        graph.kruskalMST();
    }
}
