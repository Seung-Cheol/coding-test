package org.example.june08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


/*
성능 : 메모리 14216kb 시간 128ms
 */
public class Baekjoon11899 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    Deque<Character> dq = new LinkedList<>();
    String str = bf.readLine();
    for(int i = 0; i<str.length(); i++) {
      if(str.charAt(i)=='(') {
        dq.offerFirst('(');
      } else {
        if(dq.peek()==null || dq.peek()==')') {
          dq.offerFirst(')');
        } else if(dq.peek()=='(') {
          dq.poll();
        }

      }
    }
    System.out.print(dq.size());
  }
}
