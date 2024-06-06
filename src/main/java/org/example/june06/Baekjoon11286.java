package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon11286 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
      if(Math.abs(a)==Math.abs(b)) {
        return a-b;
      } else {
        return Math.abs(a) - Math.abs(b);
      }
    });
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<number; i++) {
      int val = Integer.parseInt(bf.readLine());
      if(val==0 && pq.peek()==null) {
        sb.append(0);
        sb.append("\n");
      } else if(val==0 && pq.peek()!=null) {
        sb.append(pq.poll());
        sb.append("\n");
      } else {
        pq.offer(val);
      }
    }
    System.out.print(sb);
  }
}
