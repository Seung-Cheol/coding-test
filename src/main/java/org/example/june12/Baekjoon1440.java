package org.example.june12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



/*
성능 : 메모리 16372kb 시간 160ms
 */
public class Baekjoon1440 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    List<String> set = new ArrayList<>();
    String[] strArr = bf.readLine().split(":");

    //3개를 무작위로 섞는 경우의 수 이므로
    for(int i = 0; i< strArr.length; i++) {
      for(int j = 0; j < strArr.length; j++) {
        for(int k = 0; k < strArr.length; k++) {

          //j i k 가 각각 달라야 하기 떄문에
          if(i==j || j==k || i==k) {
              continue;
          }

          //첫번째 항목에는 1~12
          if(Integer.parseInt(strArr[i]) > 12 || Integer.parseInt(strArr[i])==0) {
            continue;
          }

          //나머지 항목에는 60미만
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
