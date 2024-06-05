package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
성능 : 메모리 14232kb 시간 124ms
 */
public class Baekjoon7567 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String word = bf.readLine();
    Deque<Character> dq = new ArrayDeque<>();
    int cm = 0;
    for(int i = 0; i<word.length(); i++) {

      //초기값을 설정합니다
      if(i==0) {
        dq.addFirst(word.charAt(i));
        cm += 10;
        continue;
      }
      //만약 이전 값과 현재 값이 같으면 5를 더합니다
      if(dq.peek()==word.charAt(i)) {
        cm += 5;
      } else {
        //다른 경우 10을 더합니다
        cm += 10;
      }
      //값을 설정합니다
      dq.addFirst(word.charAt((i)));
    }
    System.out.print(cm);
  }
}
