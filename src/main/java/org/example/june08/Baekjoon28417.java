package org.example.june08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
성능 : 메모리 96532kb 시간 708ms
 */
public class Baekjoon28417 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    int point = 0;
    for(int i = 0; i<count; i++) {
      int tempPoint = 0;
      int[] tempArr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      tempPoint += Math.max(tempArr[0], tempArr[1]);
      tempArr[0] = 0;
      tempArr[1] = 0;
      Arrays.sort(tempArr);
      tempPoint += tempArr[tempArr.length-1];
      tempPoint += tempArr[tempArr.length-2];
      point = Math.max(point, tempPoint);
    }
    System.out.print(point);
  }

}
