package org.example.june18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2212 {

  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    int count = Integer.parseInt(bf.readLine());
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if(count >= number) {
      System.out.print(0);
      return;
    }

    Arrays.sort(line);
    int[] minus = new int[line.length - 1];
    for(int i = 1; i < line.length; i++) {
      minus[i - 1] = line[i] - line[i - 1];
    }
    Arrays.sort(minus);
    int sum = 0;
    for(int i = 0; i < minus.length - (count - 1); i++) {
      sum += minus[i];
    }
    System.out.print(sum);
  }
}
