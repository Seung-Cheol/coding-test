package org.example.june17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
메모리 16136kb 시간 180ms
 */
public class Baekjoon2512 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    long totalMoney = Integer.parseInt(bf.readLine());
    long min = 0;
    long max = Arrays.stream(line).max().getAsInt();
    while(max >= min) {
      long mid = (max + min) / 2;
      long tempSum = 0;
      for(int money : line) {
        if(money >= mid) {
          tempSum += mid;
        } else {
          tempSum += money;
        }
      }
      if(tempSum > totalMoney) {
        max = mid -1;
      } else {
        min = mid +1;
      }
    }
    System.out.print(max);
  }
}
