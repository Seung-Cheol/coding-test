package org.example.june14;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
성능 : 메모리 14084 kb 시간 124 ms
 */
public class Baekjoon5585 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int price = Integer.parseInt(bf.readLine());
    int restMoney = 1000 - price;
    int count = 0;
    int[] money = new int[]{500,100,50,10,5,1};
    for(int i = 0; i<money.length; i++) {
      count += restMoney / money[i];
      restMoney = restMoney % money[i];
    }
    System.out.print(count);
  }

}
