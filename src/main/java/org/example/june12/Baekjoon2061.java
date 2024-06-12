package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon2061 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] line = bf.readLine().split(" ");
    BigInteger K = new BigInteger(line[0]);
    BigInteger L = new BigInteger(line[1]);
    for(int i = 2; i<L.intValue(); i++) {
      if(K.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
        System.out.print("BAD " + i);
        return;
      }
    }
    System.out.print("GOOD");
  }
}
