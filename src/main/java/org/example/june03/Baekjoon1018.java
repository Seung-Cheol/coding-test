package org.example.june03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1018 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    int row = Integer.parseInt(str.split(" ")[0]);
    int column = Integer.parseInt(str.split(" ")[1]);
    boolean[][] board = new boolean[row][column];
    for(int i = 0; i<row; i++) {
      String boardColumn = bf.readLine();
      for(int a = 0; a<boardColumn.length(); a++) {
        board[i][a] = boardColumn.charAt(a)=='W';
      }
    }
    int result = 64;
    //시작지점 0,0부터 최대까지 반복문 돌리기
    for(int i = 0; i<row-8+1; i++) {
      for(int a = 0; a<column-8+1; a++) {
        // 8*8만큼 이중포문 돌리기
        int count = resultCount(board,i,a);
        if(result > count) {
          //최소값 업데이트
          result = count;
        }
      }
    }
    System.out.println(result);
  }

  /*
  8*8이 시작이 블랙일 경우와 화이트일 경우를 산정해서 최소값 리턴
  */
  public static int resultCount(boolean[][] board, int startX, int startY) {
    int count1 = 0;
    int count2 = 0;
    boolean firstColor = true;

    for(int x = startX; x < startX + 8; x++) {
      for(int y = startY; y < startY + 8; y++) {
        if(board[x][y] != firstColor) {
          count1++;
        }
        if(board[x][y] == firstColor) {
          count2++;
        }
        firstColor = !firstColor;
      }
      firstColor = !firstColor;
    }
    return Math.min(count1, count2);
  }
}
