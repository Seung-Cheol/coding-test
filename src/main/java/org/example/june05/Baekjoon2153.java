package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리 14120kb, 시간 120ms
 */
public class Baekjoon2153 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String word = bf.readLine();
    int sum = 0;
    int count = 0;
    for(int i = 0; i<word.length(); i++) {
      //소문자의 경우 96을 빼면 문제에서 제시한 숫자가 됩니다(아스키코드값 a = 97)
      if(word.charAt(i) >= 97) {
        sum += word.charAt(i) - 96;
        //대문자의 경우 38을 빼면 문제에서 제시한 숫자가 됩니다(아스키코드값 A = 65)
      } else {
        sum += word.charAt(i) - 38;
      }
    }
    //반복문을 합의 절반만큼만 돌려서 소수인지를 판별합니다
    for(int i = 2; i<sum/2 + 1; i++) {
      count = sum%i == 0 ? count + 1 : count;
    }

    if(count >= 1) {
      System.out.print("It is not a prime word.");
    } else {
      System.out.print("It is a prime word.");
    }
  }
}
