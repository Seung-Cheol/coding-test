package org.example;

import java.util.Scanner;
/*
1. x번째가 몇번째 줄인지 구하고
2. 위에서 먼저 시작하는지 아래에서 먼저 시작하는지 구한다음에
3. 분수를 구한다
 */
public class Baekjoon1193 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
  }
  private static String answer(int x) {
    int row = 1;
    int k = 1;
    while(x-k > 0) {
      row++;
      k = k+row;
    }
    int num = x - (k-row);
    int left = 1;
    int right = row;
    for(int i = 1; i<num; i++) {
      left = left +1;
      right = right -1;
    }
    String str  = "";
    if(row%2==0) {
      str = left+"/"+right;
    } else {
      str = right+"/"+left;
    }
    return str;
  }

}
