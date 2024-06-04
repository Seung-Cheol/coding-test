package org.example.june04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1244 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int switchNum = Integer.parseInt(bf.readLine());
    int[] tempArr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] switchArr = new int[switchNum+1];
    switchArr[0] = 0;
    System.arraycopy(tempArr, 0, switchArr, 1, switchArr.length - 1);
    int studentNum = Integer.parseInt(bf.readLine());
    for(int i = 0; i<studentNum; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(temp[0]==1) {
        for(int a = temp[1]; a < switchArr.length; a=a+temp[1]) {
          switchArr[a] = switchArr[a] == 0 ? 1 : 0;
        }
      }

      if(temp[0]==2) {
        int count = 0;
        while(true) {
          int left = temp[1]-count;
          int right = temp[1]+count;
          if(switchArr.length <= right || left <= 0 || switchArr[left]!=switchArr[right]) {
            break;
          }
          if(count==0) {
            switchArr[temp[1]] = switchArr[temp[1]] == 0 ? 1 : 0;
          } else {
            switchArr[left] = switchArr[left] == 0 ? 1 : 0;
            switchArr[right] = switchArr[right] == 0 ? 1 : 0;
          }
          count++;
        }
      }
    }
    for(int i = 1; i<switchArr.length; i++) {
      System.out.print(switchArr[i] + " ");
      if(i % 20 == 0) {
        System.out.println();
      }
    }
  }
}
