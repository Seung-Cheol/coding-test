package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
성능 : 메모리 14036kb 성능 124ms
 */
public class Baekjoon10419 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    for(int i = 0; i<count; i++) {
      int t = Integer.parseInt(bf.readLine());
      int temp = 0;
      //전체 값 >= a^2 + a가 성립해야 함
      for (int j = 0; j < t; j++) {
        if (t - j * j < j) {
          break;
        } else {
          temp = j;
        }
      }
      System.out.println(temp);
    }
  }
}
