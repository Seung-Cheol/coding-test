package org.example.june15;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
성능 : 메모리 14156kb 시간 124ms
 */
public class Baekjoon9095 {

  static int result = 0;
  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    for(int i = 0; i<count; i++) {
      int number = 0;
      int target = Integer.parseInt(bf.readLine());
      for(int a = 1; a<=3; a++) {
        dp(a, target);
      }
      System.out.println(result);
      result = 0;
    }

  }

  public static void dp(int value, int target) {
    if(target == value) {
      result++;
      return;
    } else if(value > target) {
      return;
    } else {
      dp(value + 1, target);
      dp(value + 2, target);
      dp(value + 3, target);
    }
  }
}
