package org.example.may31;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon24313 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = bf.readLine().split(" ");
    int c = Integer.parseInt(bf.readLine());
    int n = Integer.parseInt(bf.readLine());
    int fn = Integer.parseInt(arr[0])*n+Integer.parseInt(arr[1]);
    int gn = c*n;
      System.out.print(
        fn <= gn ? 1 : 0
      );
  }
}
