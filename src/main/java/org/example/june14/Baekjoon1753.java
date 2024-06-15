package org.example.june14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Baekjoon1753 {

  static List<Node>[] nodes;
  static boolean[] visited;
  static int[] distance; // 최단거리 행렬

  public static void main(String[] args) throws IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));

    String[] ve = br.readLine().split(" ");
    int v = Integer.parseInt(ve[0]);
    int e = Integer.parseInt(ve[1]);

    //여기서 배열의 인덱스는 점이고 밸류는 어레이리스트이다.
    //어레이리스트의 값들은 노드이고 노드는 각각 이어지는 점과 가중치이다.
    nodes = new ArrayList[v + 1];
    //방문했는지 체크하는 배열이다
    visited = new boolean[v + 1];
    //배열의 인덱스는 점이고 밸류는 시작점으로부터의 최단 거리이다.
    distance = new int[v + 1];

    int start = Integer.parseInt(br.readLine());
    //점의 숫자 + 1 만큼 어레이리스트를 넣는다
    //거리 디폴트를 무한으로 설정한다
    for (int i = 0; i <= v; i++) {
      nodes[i] = new ArrayList<>();
      distance[i] = Integer.MAX_VALUE;
    }

    for (int i = 0; i < e; i++) {
      //간선의 시작과 끝, 그리고 가중치를 입력받는다
      String[] edge = br.readLine().split(" ");

      int from = Integer.parseInt(edge[0]);
      int to = Integer.parseInt(edge[1]);
      int weight = Integer.parseInt(edge[2]);

      //배열의 인덱스는 시작점이고 끝점과 가중치는 node에 넣는다.
      nodes[from].add(new Node(to, weight));
    }

    //다익스트라를 실행한다
    dijkstra(start);

    var sb = new StringBuilder();
    for (int i = 1; i <= v; i++) {
      if (distance[i] == Integer.MAX_VALUE) {
        sb.append("INF").append("\n");
      } else {
        sb.append(distance[i]).append("\n");
      }
    }
    System.out.println(sb);
  }

  public static void dijkstra(int start) {

    //weight 오름차순의 우선순위 큐를 선언한다
    PriorityQueue<Node> pq = new PriorityQueue<>();
    //시작점까지의 거리는 당연히 0이다
    distance[start] = 0;
    //시작하기 위해 시작점과 가중치 0을 큐에 넣는다
    pq.offer(new Node(start, 0));

    while (!pq.isEmpty()) {
      //최소 가중치를 가진 노드이다.
      Node cur = pq.poll();
      //목표 위치를 true로 변경한다
      visited[cur.to] = true;

      //목표 노드를 시작점으로 하는 다른 노드들을 부른다.
      //cur.to는 현재 점
      //node.to는 다음 점
      for (Node node : nodes[cur.to]) {
        //만약 그 노드를 방문했다면 지나친다.
        if (visited[node.to]) {
          continue;
        }
        //시작점 1부터 n까지의 거리 + 선의 가중치 < 그 노드까지의 전체 가중치
        if (distance[cur.to] + node.weight < distance[node.to]) {
          //그 노드까지의 전체 가중치를 변경
          distance[node.to] = distance[cur.to] + node.weight;
          pq.offer(new Node(node.to, distance[node.to]));
        }
      }
    }

  }
}

class Node implements Comparable<Node> {

  public int to;
  public int weight;

  @Override
  public int compareTo(Node o) {
    return this.weight - o.weight;
  }

  public Node(
    int end,
    int cost
  ) {
    this.to = end;
    this.weight = cost;
  }
}