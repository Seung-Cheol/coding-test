package org.example.june14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Baekjoon1504 {
  static List<Node2>[] arr;
  static int[] distance;
  static int point;
  static int INF = 2000000 * 100;
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] counts = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    point = counts[0];
    int line = counts[1];
    arr = new ArrayList[point + 1];
    distance = new int[point + 1];
    for(int i = 0; i<=point; i++) {
      arr[i] = new ArrayList<>();
      distance[i] = INF;
    }

    for(int i = 0; i<line; i++) {
      int[] lines = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int from = lines[0];
      int to = lines[1];
      int weight = lines[2];
      arr[from].add(new Node2(to, weight));
      arr[to].add(new Node2(from, weight));
    }

    int[] routes = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int sum1 = 0;
    sum1 += solution(1,routes[0]);
    sum1 += solution(routes[0],routes[1]);
    sum1 += solution(routes[1],point);

    int sum2 = 0;
    sum2 += solution(1,routes[1]);
    sum2 += solution(routes[1],routes[0]);
    sum2 += solution(routes[0],point);

    if(sum1 >= INF && sum2 >= INF) {
      System.out.print(-1);
    } else {
      System.out.print(Math.min(sum2, sum1));
    }

  }

  public static int solution(int start, int end) {
    Arrays.fill(distance,INF);
    PriorityQueue<Node2> pq = new PriorityQueue<>((e,q)->e.weight - q.weight);
    boolean[] visited = new boolean[point + 1];
    distance[start] = 0;
    pq.offer(new Node2(start,0));
    while(!pq.isEmpty()) {
      Node2 node = pq.poll();
      int from = node.to;
      if(visited[from]) {
        continue;
      }
      visited[from] = true;
      for(Node2 n : arr[from]) {
        int nextPoint = n.to;
        int nextWeight = n.weight;
        if(distance[from] + nextWeight < distance[nextPoint]) {
          distance[nextPoint] = distance[from] + nextWeight;
          pq.offer(new Node2(nextPoint, distance[nextPoint]));
        }
      }
    }
    return distance[end];
  }
}

class Node2 {
  int to;
  int weight;

  public Node2(
    int end,
    int cost
  ) {
    this.to = end;
    this.weight = cost;
  }


}
