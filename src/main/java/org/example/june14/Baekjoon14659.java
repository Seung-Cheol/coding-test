package org.example.june14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
성능 : 메모리 20147kb 시간 464ms
 */
public class Baekjoon14659 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    int[] camel = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int result = 0;
    for(int i = 0; i<count; i++) {
      int max = camel[i];
      int tempCount = 0;
      for(int a = i+1; a<count; a++) {
        if(max==camel[a]) {
          continue;
        }
        if(max > camel[a]) {
          tempCount++;
        }
        if(max < camel[a]) {
          break;
        }
      }
      if(tempCount > result) {
        result = tempCount;
      }
    }
    System.out.print(result);
  }
}
