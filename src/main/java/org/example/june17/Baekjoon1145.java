package org.example.june17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
성능 : 메모리 14860kb 시간 164ms
 */
public class Baekjoon1145 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int result = 1;
    while(true) {
      int count = 0;
      for (int i = 0; i < line.length; i++) {
        if(result%line[i] == 0) {
          count++;
        }
      }
      if(count>=3) {
        break;
      }
      result++;
    }
    System.out.print(result);
  }

}
