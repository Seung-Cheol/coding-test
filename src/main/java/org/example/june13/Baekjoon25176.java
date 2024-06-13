package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
성능 : 메모리 14080kb 성능 124ms
 */
public class Baekjoon25176 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    //앞뒤가 같은게 청정수열이므로 팩토리얼 계산 수행
    for(int i = number -1; i>0; i--) {
      number = number * i;
    }
    System.out.print(number);
  }

}
