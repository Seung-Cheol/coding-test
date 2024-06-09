package org.example.june09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
성능 : 메모리 158048kb 시간 1008ms
 */
public class Baekjoon10815 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count1 = Integer.parseInt(bf.readLine());
    int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int count2 = Integer.parseInt(bf.readLine());
    int[] arr2 = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Map<Integer, Integer> map = new HashMap<>();
    for (int j : arr) {
      map.put(j, 0);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i<arr2.length; i++) {
      if (map.get(arr2[i]) == null) {
        sb.append(0);
      } else {
        sb.append(1);
      }
      if(i!=arr2.length-1) {
        sb.append(" ");
      }
    }
    System.out.print(sb);
  }
}
