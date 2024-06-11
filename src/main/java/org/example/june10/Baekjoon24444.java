package org.example.june10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon24444 {
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] check;
  static int number;
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] count = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    check = new int[count[0]+1];

    for(int i = 0; i < count[0] + 1; i++) {
      graph.add(new ArrayList<>());
    }

    //양방향 그래프이므로 index와 값 서로 뒤바꿔서 add시켜줍니다
    for(int i = 0; i<count[1]; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph.get(temp[0]).add(temp[1]);
      graph.get(temp[1]).add(temp[0]);
    }
    for (ArrayList<Integer> integers : graph) {
      Collections.sort(integers);
    }
    number = 1;
    Queue<Integer> q = new LinkedList<>();
    q.add(count[2]);
    check[count[2]] = number;
    System.out.print(seqResult(q));

  }

  private static StringBuilder seqResult(Queue<Integer> q) {
    StringBuilder sb = new StringBuilder();
    while(!q.isEmpty()) {
      int firstValue = q.poll();
      for (int i = 0; i < graph.get(firstValue).size(); i++) {
        int innerValue = graph.get(firstValue).get(i);
        if (check[innerValue] == 0) {
          q.add(innerValue);
          check[innerValue] = ++number;
        }
      }
    }
    for(int i = 1; i<check.length; i++) {
      sb.append(check[i]).append("\n");
    }
    return sb;
  }
}
