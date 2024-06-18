package org.example.june18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon9465 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    for(int i = 0; i<number; i++) {
      int number2 = Integer.parseInt(bf.readLine());
      boolean[] check = new boolean[number2];
      int[] first = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] second = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


    }

  }

}
