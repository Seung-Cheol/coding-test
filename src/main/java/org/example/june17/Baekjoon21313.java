package org.example.june17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14056kb 시간 124ms
 */
public class Baekjoon21313 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    if(number%2==0) {
      System.out.print("1 2 ".repeat(number/2).trim());
    } else {
      StringBuilder sb = new StringBuilder();
      sb.append("1 2 ".repeat(number/2 -1));
      sb.append("1 2 3 ");
      System.out.print(sb.toString().trim());
    }
  }

}
