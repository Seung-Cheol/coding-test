package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


/*
성능 : 메모리 17200kb 시간 148ms
 */
public class Baekjoon1251 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    int strLength = str.length();
    PriorityQueue<String> pq = new PriorityQueue<>();
      for(int j = 1; j<strLength; j++) {
        for(int k = j+1; k<strLength; k++) {
          String first = new StringBuffer(str.substring(0, j)).reverse().toString();
          String second = new StringBuffer(str.substring(j, k)).reverse().toString();
          String third = new StringBuffer(str.substring(k, strLength)).reverse().toString();
          pq.offer(first + second + third);
        }
      }
    System.out.print(pq.peek());
  }
}
