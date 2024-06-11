package org.example.june11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Baekjoon13975 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    PriorityQueue<Long> pq = new PriorityQueue<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<count; i++) {
      int count2 = Integer.parseInt(bf.readLine());
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for(int a = 0; a<temp.length; a++) {
        pq.offer((long) temp[a]);
      }
      long sum = 0;
      while(pq.size() > 1) {
        long tempSum =  pq.poll() + pq.poll();
        sum += tempSum;
        pq.offer(tempSum);
      }
      pq.clear();
      sb.append(sum).append("\n");
    }
    System.out.print(sb);
  }
}
