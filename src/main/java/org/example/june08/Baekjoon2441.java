package org.example.june08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14188kb 시간 120ms
 */
public class Baekjoon2441 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int line = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = line; i>0; i--) {
      sb.append(" ".repeat(line-i)).append("*".repeat(i)).append("\n");
    }
    System.out.print(sb);
  }

}
