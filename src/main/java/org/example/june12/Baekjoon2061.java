package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


/*
성능 : 메모리 209850 KB 시간 484ms
 */
public class Baekjoon2061 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] line = bf.readLine().split(" ");
    //무한의 수를 저장할 수 있는 BigIntger 선언
    BigInteger K = new BigInteger(line[0]);
    BigInteger L = new BigInteger(line[1]);

    //1개만 구하면 되고 값도 100만 아래라서 때문에 에라토스테네스의 체 불필요
    for(int i = 2; i<L.intValue(); i++) {
      if(K.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
        //L보다 낮은 수의 소인수?약수가 나온다면 리턴 후 BAD
        System.out.print("BAD " + i);
        return;
      }
    }
    System.out.print("GOOD");
  }
}
