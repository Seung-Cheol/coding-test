package org.example.june03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2477 {

  /*
  넓은 사각형에서 좁은 사각형을 뺀다
  좁은 사각형의 규칙은 4 -> 1 -> 4 -> 1 처럼 동일한 두번의 방향으로 이동하는 규칙이 있음
  그래서 이 규칙으로 좁은 사각형의 가로세로를 구하고

  넓은 사각형의 경우에는 2,4,6 1,3,5 각각의 순서에서 각각 가장 큰 길이를 곱하면 됨
   */

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int amount = Integer.parseInt(bf.readLine());
    int[] arrow = new int[6];
    int[] length = new int[6];
    for(int i = 0; i<6; i++) {
      String[] temp = bf.readLine().split(" ");
      arrow[i] = Integer.parseInt(temp[0]);
      length[i] = Integer.parseInt(temp[1]);
    }
    int smallSquare = 0;
    for(int i = 0; i<6; i++) {
      if(arrow[i]==arrow[(i+2)%6] && arrow[(i+1)%6]==arrow[(i+3)%6]) {
        smallSquare = length[(i+2)%6] * length[(i+1)%6];
      }
    }
    int total = Math.max(Math.max(length[1],length[3]),length[5]) *  Math.max(Math.max(length[0],length[2]),length[4]);
    System.out.print((total - smallSquare) * amount);
  }
}
