package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon1440 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    List<String> set = new ArrayList<>();
    String[] strArr = bf.readLine().split(":");
    for(int i = 0; i< strArr.length; i++) {
      for(int j = 0; j < strArr.length; j++) {
        for(int k = 0; k < strArr.length; k++) {
          if(i==j || j==k || i==k) {
              continue;
          }
          if(Integer.parseInt(strArr[i]) > 12 || Integer.parseInt(strArr[i])==0) {
            continue;
          }
          if(Integer.parseInt(strArr[j]) > 59 || Integer.parseInt(strArr[k]) > 59) {
            continue;
          }

          set.add(strArr[i] + strArr[j] + strArr[k]);

        }
      }
    }
    System.out.print(set.size());
  }

}
