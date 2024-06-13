package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1182 {
  static int target;
  static int[] arr;
  static int count = 0;
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] info = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    target = info[1];
    dfs(0,0);

    System.out.print(target==0 ? count - 1 : count);
  }

  public static void dfs(int index, int sum) {
      if(index == arr.length) {
        if (sum == target) {
          count++;
        }
        return;
      }
      dfs(index + 1, sum + arr[index]);
      dfs(index + 1, sum);
  }
}
