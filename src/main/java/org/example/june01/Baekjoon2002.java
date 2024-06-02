package org.example.june01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/*
들어온 차량과 순서를 저장하고
나갈 때 추월했는지를 비교함
 */
public class Baekjoon2002 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int carNum = Integer.parseInt(bf.readLine());
    Map<String,Integer> enterCar = new HashMap<>();
    List<String> leaveCar = new ArrayList<>();

    for(int i = 0; i < carNum; i++) {
      enterCar.put(bf.readLine(), i);
    }

    for(int i = 0; i < carNum; i++) {
      leaveCar.add(bf.readLine());
    }

    // 계산 로직
    int result = takeOver(enterCar, leaveCar);
    System.out.println(result);
  }

  public static int takeOver(Map<String,Integer> enterCar, List<String> leaveCar) {

    int result = 0;
    for (int i = 0; i < leaveCar.size(); i++) {
      for (int j = i + 1; j < leaveCar.size(); j++) {
        if (enterCar.get(leaveCar.get(i)) > enterCar.get(leaveCar.get(j))) {
          result++;
          break;
        }
      }
    }

    return result;
  }
}