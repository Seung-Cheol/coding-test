package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1920 {
  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count1 = Integer.parseInt(bf.readLine());
    Map<Integer, Integer> numberMap = new HashMap<>();
    int[] line1 = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for(int i = 0 ; i<count1; i++) {
      numberMap.put(line1[i], numberMap.getOrDefault(line1[i], 0) + 1);
    }
    int count2 = Integer.parseInt(bf.readLine());
    int[] line2 = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for(int i = 0 ; i<count2; i++) {
      if(!numberMap.containsKey(line2[i])) {
        System.out.println(0);
      } else {
        System.out.println(1);
      }
    }
  }
}
