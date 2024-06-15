package org.example.june15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14228kb 시간 128ms
 */
public class Baekjoon2745 {
  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String[] input = bf.readLine().split(" ");
    String N = input[0];
    int B = Integer.parseInt(input[1]);
    int sum = 0;
    for(int i = N.length()-1; i>=0; i--) {
      int value;
      double pow = Math.pow(B, N.length() - 1 - i);
      if(N.charAt(i) <= 57) {
        value = (N.charAt(i) - 48) * (int) pow;
      } else {
        value = (N.charAt(i) - 55) * (int) pow;
      }
      sum += value;
    }
    System.out.print(sum);
  }

}
