package org.example.june13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
/*
성능 : 메모리 16536kb 시간 180ms
 */
public class Baekjoon5568 {
  static int n,k;
  static Set<String> set = new HashSet<>();
  static int[] numbers;
  static boolean[] index;
  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(bf.readLine());
    k = Integer.parseInt(bf.readLine());
    numbers = new int[n];
    index = new boolean[n];
    for(int i = 0; i<n; i++) {
      numbers[i] = Integer.parseInt(bf.readLine());
    }
    //초기 자리수와 문자열 지정
    dfs(0,"");
    System.out.print(set.size());
  }


  public static void dfs(int number, String str) {
    //자리수가 됐을 경우
    if(number==k) {
      //hashset에 넣어서 중복 제거
      set.add(str);
      return;
    }
    for(int i = 0; i<n; i++) {
      //방문 인덱스 지워주기
      if(!index[i]) {
        index[i] = true;
        dfs(number + 1, str +  numbers[i]);
        //for문 첫 번쨰가 끝났으면 false로 변경 후 다음 for문 진행
        index[i] = false;
      }
    }
  }
}
