package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/*
성능 : 메모리 49856kb 시간 436ms
 */
public class Baekjoon27160 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> fruitMap = new HashMap<>();
    int number = Integer.parseInt(bf.readLine());
    for (int i = 0; i < number; i++) {
      String[] temp = bf.readLine().split(" ");
      //hashmap에 값과 밸류를 넣습니다. 기존에 있는 key값인 경우 기존 value를 합칩니다
      fruitMap.put(temp[0],
        fruitMap.getOrDefault(temp[0],0) + Integer.parseInt(temp[1])
      );
    }
    //밸류에 5가 포함됐을 경우 YES를 출력하고 메소드를 끝냅니다
    for (int value : fruitMap.values()) {
      if (value == 5) {
        System.out.print("YES");
        return;
      }
    }
    //메소드가 안끝났다면 NO를 출력합니다
    System.out.print("NO");
  }
}
