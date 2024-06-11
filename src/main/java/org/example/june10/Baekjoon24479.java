package org.example.june10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon24479 {
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] check;
  static int number;
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] count = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    //check의 index는 점의 숫자이고 value는 순서이다
    check = new int[count[0] + 1];

    //정점의 숫자가 graph의 index 숫자랑 같고
    //graph의 value는 각각의 정점에서 뻗어나가는 방향의 선분의 점 배열(arrayList)이다
    //그러나 무방향 그래프이기 때문에 1에서 4로 뻗어나간다 하면 4에서 1로 뻗어나가는것과 동일함
    for(int i = 0; i < count[0] + 1; i++) {
      graph.add(new ArrayList<>());
    }

    for(int i = 0; i<count[1]; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph.get(temp[0]).add(temp[1]);
      graph.get(temp[1]).add(temp[0]);
    }

    //오름차순으로 방문하기 때문에 오름차순으로 정렬
    for(int i = 0; i<graph.size(); i++) {
      Collections.sort(graph.get(i));
    }

    number = 1;
    seqResult(count[2]);

    StringBuilder sb = new StringBuilder();
    for(int i = 1; i < check.length; i++) {
      sb.append(check[i]).append("\n");
    }
    System.out.println(sb);
  }

  //( 정점 )을 주입받는 탐색 메소드 생성
  private static void seqResult(int point) {
    // 정점 지나가는 순서 기입
    check[point] = number;
    for(int i = 0; i<graph.get(point).size(); i++) {
      //어레이 리스트 내부의 어레이 리스트. 순회하면서 0인 경우에 해당 점으로 이동함
      int innerPoint = graph.get(point).get(i);
      if(check[innerPoint] == 0) {
        number++;
        seqResult(innerPoint);
      }
    }
  }
}
