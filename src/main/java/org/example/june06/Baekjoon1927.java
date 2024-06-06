package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
성능 : 메모리 32600kb 시간 1132ms
 */
public class Baekjoon1927 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i = 0 ; i < count; i++) {
      int number = Integer.parseInt(bf.readLine());
      //number가 0일 경우
      if(number==0) {
        //peek이 null이 아니라면 poll, 맞다면 0을 출력합니다
        System.out.println(pq.peek() != null ? pq.poll() : 0);
      } else {
        //0이 아닐경우 삽입합니다.
        pq.offer(number);
      }
    }
  }
}
