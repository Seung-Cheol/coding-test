package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14140 kb 시간 124 ms
 */
public class Baekjoon30821 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    long square = Integer.parseInt(bf.readLine());
    //square 콤비네이션 5이므로 공식 작성
    System.out.print(
      (square) * (square-1) * (square-2) * (square -3) * (square -4)
        /
        120
    );
  }
}
