package org.example.june07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
성능 : 메모리  14076kb 속도  100ms
 */
public class Baekjoon11557 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    for(int i = 0; i<count; i++) {
      int tf = isNumber(bf.readLine());
      if(tf!=-1) {
        int drink = 0;
        String name = null;
        for(int a = 0; a<tf; a++) {
          String[] temp = bf.readLine().split(" ");
          String tempName = temp[0];
          int tempDrink = Integer.parseInt(temp[1]);
          if(tempDrink > drink) {
            drink = tempDrink;
            name = tempName;
          }
        }
        System.out.println(name);
      }
    }

  }


  private static int isNumber(String str) {
    try {
      return Integer.parseInt(str);
    } catch (Exception e) {
      return -1;
    }
  }
}
