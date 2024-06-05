package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


/*
성능 : 메모리 24664kb , 성능 272ms
 */
public class Baekjoon17608 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> count = new ArrayDeque<>();
    int number = Integer.parseInt(bf.readLine());
    for(int i = 0; i<number; i++) {
      int temp = Integer.parseInt(bf.readLine());
      removeLast(temp, count);
    }
    System.out.println(count.size());
  }

  public static void removeLast(int temp, Deque<Integer> count) {
    //첫번째 함수 호출의 경우 예외 없이 값을 집어 넣습니다
    if(count.peek()==null) {
      count.addFirst(temp);
      return;
    }
    //들어오는 숫자가 더 큰경우
    if(count.peek() <= temp) {
      //맨 앞의 숫자를 지웁니다
      count.removeFirst();
      //이 과정을 계속 반복하기 위해 재귀 호출합니다
      removeLast(temp, count);
    } else {
      //재귀 스택 종료하는 경우 들어온 값을 맨 앞에 집어 넣습니다
      count.addFirst(temp);
    }
  }
}
