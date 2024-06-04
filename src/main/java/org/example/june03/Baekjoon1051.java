package org.example.june03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1051 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String rowColumn = bf.readLine();
    int row = Integer.parseInt(rowColumn.split(" ")[0]);
    int column = Integer.parseInt(rowColumn.split(" ")[1]);
    //최대값이므로 끝좌표일때 0더해도 괜찮음 어차피 0리턴이기 떄문에
    char[][] board = new char[row+100][column+100];
    //정사각형 최대 변 길이 산정
    int maxLine = Math.min(row, column);
    //값 집어넣기
    for(int i = 0; i<row; i++) {
      String line = bf.readLine();
      for(int a = 0; a<column; a++) {
        board[i][a] = line.charAt(a);
      }
    }
    int result = 0;
    for(int i = 0; i<row; i++) {
      for(int a = 0; a<column; a++) {
        //보드, 시작점 xy좌표, 최대 변길이 주입
        int temp = lineResult(board, i, a, maxLine);
        result = Math.max(temp, result);
      }
    }
    System.out.print(result);
  }

  public static int lineResult(char[][] board, int i, int a, int maxLine) {
    int result = 0;
    for(int x = 0; x<maxLine; x++) {
      //4개 좌표의 값이 동일한 경우에 곱하여 리턴
      if(
        board[i][a] == board[i][a+x] &&
        board[i+x][a] == board[i][a+x] &&
        board[i][a+x] == board[i+x][a+x]) {

        result = (x + 1) * (x + 1);
      }
    }
    return result;
  }
}
