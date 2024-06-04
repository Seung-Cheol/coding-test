package org.example.june04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2615 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int[][] board = new int[21][21];
    int x = -1;
    int y = -1;
    int result = 0;
    for(int i = 1; i< 20; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.arraycopy(temp, 0, board[i], 1, 19);
    }

    for(int i = 1; i<16; i++) {
      for(int a = 1; a<16; a++) {
        if(board[i][a]==0) {
          continue;
        }

        if(board[i-1][a]==board[i][a] || board[i][a-1]==board[i][a] || board[i-1][a-1]==board[i][a] || board[i-1][a+1]==board[i][a]) {
          continue;
        }

        if(board[i][a]==board[i+1][a] && board[i+1][a] == board[i+2][a] && board[i+2][a] == board[i+3][a] && board[i+3][a] == board[i+4][a] && board[i][a]!=board[i+5][a]) {
          x = i;
          y = a;
          result = board[i][a];
          break;
        }

        if(board[i][a]==board[i+1][a+1] && board[i+1][a+1] == board[i+2][a+2] && board[i+2][a+2] == board[i+3][a+3] && board[i+3][a+3] == board[i+4][a+4] && board[i][a]!=board[i+5][a+5]) {
          x = i;
          y = a;
          result = board[i][a];
          break;
        }

        if(board[i][a]==board[i][a+1] && board[i][a+1] == board[i][a+2] && board[i][a+2] == board[i][a+3] && board[i][a+3] == board[i][a+4]&& board[i][a]!=board[i][a+5]) {
          x = i;
          y = a;
          result = board[i][a];
          break;
        }

        if(a > 4 && board[i][a]==board[i+1][a-1] && board[i+1][a-1] == board[i+2][a-2] && board[i+2][a-2] == board[i+3][a-3] && board[i+3][a-3] == board[i+4][a-4] && board[i][a]!=board[i+5][a-5]) {
          x = i;
          y = a;
          result = board[i][a];
          break;
        }


      }
    }
    if(x==-1) {
      System.out.println(0);
    } else {
      System.out.println(result);
      System.out.print(x + " " + y);
    }
  }
}
