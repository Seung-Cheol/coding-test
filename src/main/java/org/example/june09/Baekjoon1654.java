package org.example.june09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1654 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] count = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] arr = new int[count[0]];
    for(int i = 0; i<count[0]; i++) {
      arr[i] = Integer.parseInt(bf.readLine());
    }
    long min = 1;
    long max = Arrays.stream(arr).max().getAsInt();
    while(min<=max) {
      long mid = (min+max) / 2;
      int line = 0;
      for (int j : arr) {
        line += j / mid;
      }
      if(line >= count[1]) {
        min = mid+1;
      } else {
        max = mid-1;
      }
    }
    System.out.print(min-1);
  }
}
