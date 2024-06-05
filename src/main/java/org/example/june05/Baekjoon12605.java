package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


/*
성능 : 메모리 14404kb 속도 140ms
 */
public class Baekjoon12605 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder();
    Deque<String> dq = new ArrayDeque<>();
    for(int i = 0; i<number; i++) {
      //문자열을 자릅니다
      String[] temp = bf.readLine().split(" ");

      //데크에 값을 반대로 쌓습니다
      for(int a = 0; a<temp.length; a++) {
        dq.addFirst(temp[a]);
      }
      //앞문자 append
      sb.append("Case #"+(i+1)+": ");
      while(dq.size()>0) {
        //문자열을 차례대로 집어넣습니다
        sb.append(dq.poll()+" ");
        if(dq.isEmpty()) {
          //줄바꿈해줍니다
          sb.append("\n");
        }
      }
    }
    System.out.print(sb);
  }
}
