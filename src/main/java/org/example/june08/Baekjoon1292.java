package org.example.june08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
성능 : 메모리 14420kb 시간 116ms
 */
public class Baekjoon1292 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int count = 0;
    int result = 0;
    for(int i = 1; i<=1000; i++) {
      for(int a = 1; a<=i; a++) {
        count++;
        if(count >= line[0] && count<= line[1]) {
          result += i;
        }
      }
    }
    System.out.print(result);
  }
}
