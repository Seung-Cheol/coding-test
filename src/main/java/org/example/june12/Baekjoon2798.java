package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
성능 : 14412 kb 시간 132ms
 */
public class Baekjoon2798 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int max = line[1];
    int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int result = 0;
    for(int i = 0; i<arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          int temp = arr[i] + arr[j] + arr[k];
          if (max - temp >= 0 && max - temp < max - result) {
            result = temp;
          }
        }
      }
    }
    System.out.print(result);
  }
}
