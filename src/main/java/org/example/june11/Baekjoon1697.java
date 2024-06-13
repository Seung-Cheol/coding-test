package org.example.june11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon1697 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] tempInput = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = tempInput[0];
    int K = tempInput[1];
    int[] check = new int[1000002];
    check[N] = 0;
    Queue<Integer> q = new LinkedList<>();
    q.add(N);
    while (!q.isEmpty()) {
      int move = q.poll();
      if(move==K) {
        System.out.print(check[move]);
        break;
      }

      if(move <= 100000 && check[move + 1]==0) {
        check[move + 1] = check[move] + 1;
        q.add(move+1);
      }

      if(move >= 1 && check[move - 1]==0) {
        check[move - 1] = check[move] + 1;
        q.add(move-1);
      }

      if(move <=50000 &&check[move * 2]==0) {
        check[move * 2] = check[move] + 1;
        q.add(move*2);
      }

    }
  }
}
