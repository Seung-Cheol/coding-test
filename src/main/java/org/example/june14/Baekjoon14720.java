package org.example.june14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon14720 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int result = 0;
    int currentMilk = 0;

    for (int i = 0; i < count; i++) {
      if (line[i] == currentMilk) {
        result++;
        currentMilk = (currentMilk + 1) % 3;
      }
    }

    System.out.print(result);
  }
}