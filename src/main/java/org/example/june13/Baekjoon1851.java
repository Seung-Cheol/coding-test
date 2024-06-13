package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
성능 : 메모리 14132kb 시간 124ms
 */
public class Baekjoon1851 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    for(int i = 0; i<10; i++) {
      int tempSum = sum + Integer.parseInt(bf.readLine());

      //100 이상일 때 절대값 비교 하여 값 결정
      if(tempSum>=100) {
        System.out.print(
          Math.abs(100-sum) >= Math.abs(100-tempSum) ? tempSum : sum
        );
        return;
      }
      sum = tempSum;
    }
    //전부 더하지 않아도 100 이하일때 그냥 출력
    System.out.print(sum);
  }
}
