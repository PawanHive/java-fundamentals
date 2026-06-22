/*
important for interview perspective

 * Cheapest Flights within K Stops
 * --------------------------------
 * There are n cities connected by some number of flights.
 * You are given an array `flights` where:
 *
 *      flights[i] = [from, to, price]
 *
 * indicates that there is a flight from city `from` to city `to`
 * with cost `price`.
 *
 * You are also given three integers: src, dst, and k.
 * Return the cheapest price from src to dst with at most k stops.
 * If there is no such route, return -1.
 *
 * (All values are positive)
 * --------------------------------
 * (Example continued)
 *
 *      flights = [ [0,1,100], [1,2,100], [2,0,100], [1,3,600], [2,3,200] ]
 *      src = 0, dst = 3, k = 1
 *
 * Graph for the example:
 *
 *              0
 *             / ^
 *       100  /   \  100
 *           v     \
 *          1 ----> 2
 *           \  100  \
 *       600  \        \  200
 *             v         v
 *              3 <------+
 *
 * Edges:
 *      0 -> 1   (100)
 *      1 -> 2   (100)
 *      2 -> 0   (100)
 *      1 -> 3   (600)
 *      2 -> 3   (200)
 *
 * Goal: cheapest cost from src(0) to dst(3) using at most k(1) stops.
 *
 * Possible paths:
 *      0 -> 1 -> 3        => 100 + 600 = 700   (1 stop: city 1)
 *      0 -> 1 -> 2 -> 3   => 100 + 100 + 200 = 400  (2 stops: not allowed, k=1)
 *
 * Since k = 1, only paths with at most 1 intermediate stop are valid.
 * So path 0 -> 1 -> 3 (1 stop) is the only valid option here.
 *
 * ans = 700
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  static class Edge {
    int src;
    int dest;
    int wt;

    public Edge (int s, int d, int wt) {
      this.src = s;
      this.dest = d;
      this.wt = wt;
    }
  }

  public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
    for (int i=0; i<graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i=0; i<flights.length; i++) {
      int src = flights[i][0];
      int dest = flights[i][1];
      int wt = flights[i][2];

      Edge e = new Edge(src, dest, wt);
      graph[src].add(e);
    }
  }

  // constructor
  static class Info {
    int v;
    int cost;
    int stops;

    public Info (int v, int c, int s) {
      this.v = v; 
      this.cost = c;
      this.stops = s;
    }
  }

  public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {

    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[] = new ArrayList[n];
    createGraph(flights, graph);

    int dist[] = new int[n];
    for (int i=0; i<n; i++) {
      if(i != src) {
        dist[i] = Integer.MAX_VALUE;
      }
    }

    Queue<Info> q = new LinkedList<>();
    q.add(new Info(src, 0, 0));

    while (!q.isEmpty()) {
      Info curr = q.remove();
      if(curr.stops > k) {
        break;
      }

      for (int i=0; i<graph[curr.v].size(); i++) {
        Edge e = graph[curr.v].get(i);
        int u = e.src;
        int v = e.dest;
        int wt = e.wt;

        // if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v] && curr.stops <= k) {
        //   dist[v] = dist[u]+wt;
        //   q.add(new Info(v, dist[v], curr.stops+1));
        // }

        if(curr.cost+wt < dist[v] && curr.stops <= k) {
          dist[v] = curr.cost+wt;
          q.add(new Info(v, dist[v], curr.stops+1));
        }
      }
    }

    // dist[dest]
    if(dist[dest] == Integer.MAX_VALUE) {
      return -1;
    } else {
      return dist[dest];
    }

  }
  public static void main(String[] args) {
    int n = 4;
    int flights[][] = {
      {0, 1, 100},
      {1, 2, 100}, 
      {2, 0, 100},
      {1, 3, 600},
      {2, 3, 200}
    };

    int src = 0, dst = 3, k = 1;

    System.out.println(
      cheapestFlight(n, flights, src, dst, k)
    );
  }
}