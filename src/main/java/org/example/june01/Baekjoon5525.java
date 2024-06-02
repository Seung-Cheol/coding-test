package org.example.june01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon5525 {

  public static void main(String[] args) throws Exception {
    /*
    1. IOI 문자열을 생성하고
    2. substring으로 비교해서 카운트한다
    => 정답방식 변경
     */
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int oCount = Integer.parseInt(bf.readLine());
    bf.readLine();
    String strArr = bf.readLine();
    int strArrLen = strArr.length();
    int count = 0;
    int result = 0;
    char preStr = 'O';
    for(int i = 0; i<strArrLen; i++) {
      char curStr = strArr.charAt(i);
      if(preStr!=curStr) {
        count++;
      } else {
        if(curStr=='O') {
          count = 0;
        } else {
          count = 1;
        }
      }
      preStr = curStr;
      if(count%2==1 && count >= oCount*2+1) {
        result++;
      }
    }
    System.out.print(result);
  }
}
