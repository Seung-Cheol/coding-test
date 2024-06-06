package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon9375 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    for(int i = 0; i<count; i++) {
      int tf = isNumber(bf.readLine());
      if(tf!=-1) {
        Map<String, Integer> fabricMap = new HashMap<>();
        for(int a = 0; a<tf; a++) {
          String temp = bf.readLine().split(" ")[1];
          fabricMap.put(temp,fabricMap.getOrDefault(temp,0) +1);
        }
        System.out.println(fabricMap.values().stream().map((e)->e+1).reduce(1,(a,b)-> a*b) -1);
      }
    }

  }

  private static int isNumber(String str) {
    try {
      return Integer.parseInt(str);
    } catch (Exception e) {
      return -1;
    }
  }

}
