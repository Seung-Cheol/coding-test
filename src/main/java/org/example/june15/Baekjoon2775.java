package org.example.june15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14016kb 시간 120ms
 */
public class Baekjoon2775 {

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[][] apart = new int[15][15];
    for(int i = 1; i<apart.length; i++) {
      apart[0][i] = i;
    }

    for(int i = 1; i<apart.length; i++) {
      int temp = 0;
      for(int a = 1; a<apart.length; a++) {
        temp += apart[i-1][a];
        apart[i][a] = temp;
      }
    }
    int count = Integer.parseInt(bf.readLine());
    for(int i = 0; i<count; i++) {
      int x = Integer.parseInt(bf.readLine());
      int y = Integer.parseInt(bf.readLine());
      System.out.println(apart[x][y]);
    }

  }

}
