package org.example.june10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon2644 {
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] check;

  static int result = -1;
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int totalPeople = Integer.parseInt(bf.readLine());
    int[] twoPeople = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int peopleCount = Integer.parseInt(bf.readLine());
    check = new int[totalPeople + 1];
    for(int i = 0; i < totalPeople + 1; i++) {
      graph.add(new ArrayList<>());
    }
    for(int i = 0; i<peopleCount; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph.get(temp[0]).add(temp[1]);
      graph.get(temp[1]).add(temp[0]);
    }
    int number = 0;
    searchMan(twoPeople[0],twoPeople[1], number);
      System.out.print(result);
  }

  private static void searchMan(int start, int end, int number) {
    check[start] = 1;
    for(int man : graph.get(start)) {
      if(check[man]==0) {
        System.out.println(number);
        if(man==end) {
            result = number + 1;
            return;
        }
        searchMan(man,end,++number);
      }
    }
  }
}
