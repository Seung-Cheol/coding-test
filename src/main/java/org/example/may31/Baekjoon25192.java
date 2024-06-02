package org.example.may31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon25192 {

  public static void main(String[] args) {
    try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(bf.readLine());
      int result = 0;
      Set<String> names = new HashSet<>();
      for(int i = 0; i<count; i++) {
        String temp = bf.readLine();
        //엔터가 나오면 HashSet 초기화
        if(temp.equals("ENTER")) {
          names = new HashSet<>();
          continue;
        }
        //값 검색해서 result +1하고 set에 add
        if(!names.contains(temp)) {
          names.add(temp);
          result++;
        }
      }
      System.out.println(result);
    } catch (Exception e) {

    }
  }
}
