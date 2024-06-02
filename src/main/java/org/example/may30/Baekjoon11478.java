package org.example.may30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon11478 {
    /*
  우선 길이만큼 반복문을 돌리고
  안에 이중포문으로 문자열을 쌓아서 하나하나씩 저장하기
  중복이 있을 수 있으므로 set에 저장하기
   */
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    Set<String> set = new HashSet<>();
    for(int i = 0; i<str.length(); i++) {
      String temp = "";
      //문자열을 차례대로 합쳐서 set에 저장합니다
      for(int a = i; a<str.length(); a++) {
        temp += str.charAt(a);
        set.add(temp);
      }
    }
    System.out.println(set.size());
  }

}
