package org.example.june01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Baekjoon1213 {
  /*
  경우의수
  1. 짝수 문자열만 존재 할 경우
  2. 짝수 문자열에 나머지 하나의 다른 문자열인 경우 2가지 루트로
  3. 짝수일경우 문자열 정렬하고 1/2 놓고 리버스 하는 형태로 출력
  4. 홀수일 경우 홀수인거 하나 찾아서 중간에 놓기
   */

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String strArr = bf.readLine();
    Map<Character, Integer> strMap = new HashMap<>();
    int strlen = strArr.length();
    for(int i = 0; i<strArr.length(); i++) {
      strMap.put(strArr.charAt(i), strMap.getOrDefault(strArr.charAt(i), 0) + 1);
    }
    String result = "";
    String oneStr = "";
    List<Character> charList = strMap.keySet().stream().sorted().collect(Collectors.toList());
    if(strlen%2 == 0) {
      for(char str : charList) {
        if(strMap.get(str)%2==1) {
          System.out.print("I'm Sorry Hansoo");
          return;
        }
        for(int i = 0; i<strMap.get(str)/2 ; i++) {
          result += str;
        }
      }
      System.out.print(result + new StringBuffer(result).reverse());
    }

    if(strlen%2 == 1) {
      for(char str : charList) {
        if(strMap.get(str)%2==1 && oneStr.isEmpty()) {
          oneStr += str;
          strMap.put(str,strMap.get(str)-1);
        } else if (strMap.get(str)%2==1 && !oneStr.isEmpty()) {
          System.out.print("I'm Sorry Hansoo");
          return;
        }
        for(int i = 0; i<strMap.get(str)/2 ; i++) {
          result += str;
        }
      }
      System.out.print(result + oneStr + new StringBuffer(result).reverse());
    }

  }
}
