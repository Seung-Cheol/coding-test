package org.example.june15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
성능 : 메모리 14580kb 시간 132ms
 */
public class Baekjoon17202 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] first = Arrays.stream(bf.readLine().split("")).mapToInt(Integer::parseInt).toArray();
    int[] second = Arrays.stream(bf.readLine().split("")).mapToInt(Integer::parseInt).toArray();
    List<Integer> arr = new ArrayList<>();
    for(int i = 0; i<first.length; i++) {
      arr.add(first[i]);
      arr.add(second[i]);
    }
    dp(arr);
  }

  public static void dp(List<Integer> arr) {
    if(arr.size()==2) {
      System.out.print(arr.get(0).toString()+arr.get(1).toString());
      return;
    }
    List<Integer> outputArr = new ArrayList<>();
    for(int i = 0; i<arr.size()-1; i++) {
      outputArr.add((arr.get(i) + arr.get(i+1))%10);
    }
    dp(outputArr);
  }

}
