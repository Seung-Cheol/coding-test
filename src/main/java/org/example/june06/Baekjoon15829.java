package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon15829 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    String str = bf.readLine();

    long MOD = 1234567891;

    long result = str.charAt(0) - 96;
    long currentValue = 1;

    for (int i = 1; i < count; i++) {
      currentValue = (currentValue * 31) % MOD;
      result = (result + (str.charAt(i) - 96) * currentValue) % MOD;
    }

    System.out.print(result);
  }
}
