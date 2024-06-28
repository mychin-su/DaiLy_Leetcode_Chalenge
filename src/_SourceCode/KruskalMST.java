package _SourceCode;

import java.util.*;

class Edge implements Comparable<Edge> {
  int src, dest;
  long weight;

  public Edge(int src, int dest, long weight) {
    this.src = src;
    this.dest = dest;
    this.weight = weight;
  }

  public int compareTo(Edge compareEdge) {
    return Long.compare(this.weight, compareEdge.weight);
  }
}

class Subset {
  int parent, rank;
}

public class KruskalMST {
  int V, E;
  Edge[] edges;

  KruskalMST(int v, int e) {
    V = v;
    E = e;
    edges = new Edge[E];
  }

  int find(Subset[] subsets, int i) {
    if (subsets[i].parent != i)
      subsets[i].parent = find(subsets, subsets[i].parent);
    return subsets[i].parent;
  }

  void union(Subset[] subsets, int x, int y) {
    int xroot = find(subsets, x);
    int yroot = find(subsets, y);

    if (subsets[xroot].rank < subsets[yroot].rank) {
      subsets[xroot].parent = yroot;
    } else if (subsets[xroot].rank > subsets[yroot].rank) {
      subsets[yroot].parent = xroot;
    } else {
      subsets[yroot].parent = xroot;
      subsets[xroot].rank++;
    }
  }

  void kruskalMST() {
    Edge[] result = new Edge[V];
    int e = 0;
    int i = 0;

    Arrays.sort(edges);

    Subset[] subsets = new Subset[V];
    for (i = 0; i < V; ++i) {
      subsets[i] = new Subset();
      subsets[i].parent = i;
      subsets[i].rank = 0;
    }

    i = 0;

    while (e < V - 1 && i < edges.length) {
      Edge next_edge = edges[i++];
      int x = find(subsets, next_edge.src);
      int y = find(subsets, next_edge.dest);

      if (x != y) {
        result[e++] = next_edge;
        union(subsets, x, y);
      }
    }

    System.out.println("Following are the edges in the constructed MST");
    long minimumCost = 0;
    for (i = 0; i < e; ++i) {
      System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
      minimumCost += result[i].weight;
    }
    System.out.println("Minimum Cost Spanning Tree: " + minimumCost);
  }

  public static void main(String[] args) {
    int V = 5;
    int E = 10;
    KruskalMST graph = new KruskalMST(V, E);

    graph.edges[0] = new Edge(0, 1, 90000000L);
    graph.edges[1] = new Edge(0, 2, 300000000L);
    graph.edges[2] = new Edge(0, 3, 300000000L);
    graph.edges[3] = new Edge(0, 4, 500000000L);
    graph.edges[4] = new Edge(1, 2, 200000000L);
    graph.edges[5] = new Edge(1, 3, 400000000L);
    graph.edges[6] = new Edge(1, 4, 300000000L);
    graph.edges[7] = new Edge(2, 3, 300000000L);
    graph.edges[8] = new Edge(2, 4, 400000000L);
    graph.edges[9] = new Edge(3, 4, 400000000L);

    graph.kruskalMST();
  }
}
