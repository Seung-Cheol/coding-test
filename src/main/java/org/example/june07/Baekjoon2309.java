package org.example.june07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
성능 : 메모리 14316kb 시간 132ms
 */
public class Baekjoon2309 {
  public static void main(String[] args)  throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] list = new int[9];
    int[] result = new int[7];
    for(int i = 0; i<9; i++) {
      list[i] = Integer.parseInt(bf.readLine());
    }

      for(int i = 0; i<9; i++) {
        for(int a = i + 1; a<9; a++) {
          int tempSum = 0;
          int index = 0;
          for (int k = 0; k < 9; k++) {
            if (k != i && k != a) {
              result[index++] = list[k];
              tempSum += list[k];
            }
          }
          if(tempSum == 100) {
            Arrays.sort(result);
            for(int rs : result) {
              System.out.println(rs);
            }
            return;
          }
        }
      }
  }
}
