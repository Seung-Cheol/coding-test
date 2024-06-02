package org.example.may30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1546 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    bf.readLine();
    String[] str = bf.readLine().split(" ");
    //최대값을 구한다
    int max = Arrays.stream(str).mapToInt(Integer::parseInt).max().getAsInt();
    float total = 0;
    //조작된 평균 총 합을 구한다.
    for(String s : str) {
      total += Integer.parseInt(s) / (float) max * 100;
    }
    //평균을 출력한다
    System.out.println(total/str.length);
  }
}
