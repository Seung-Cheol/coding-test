package org.example.may29;

import java.util.Scanner;

public class Baekjoon8979 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] firstInput = scanner.nextLine().split(" ");
    int size = Integer.parseInt(firstInput[0]);
    int target = Integer.parseInt(firstInput[1]);

    int[][] arr = new int[size][4];
    for(int i = 0; i < size; i++) {
      String[] input = scanner.nextLine().split(" ");
      arr[i][0] = Integer.parseInt(input[0]); // 국가 번호
      arr[i][1] = Integer.parseInt(input[1]); // 금
      arr[i][2] = Integer.parseInt(input[2]); // 은
      arr[i][3] = Integer.parseInt(input[3]); // 동
    }

    // 내림차순 정렬 (금 > 은 > 동)
    for(int i = 0; i < arr.length; i++) {
      for(int a = 0; a < arr.length - 1 - i; a++) {
        if(arr[a+1][1] > arr[a][1] ||
          (arr[a+1][1] == arr[a][1] && arr[a+1][2] > arr[a][2]) ||
          (arr[a+1][1] == arr[a][1] && arr[a+1][2] == arr[a][2] && arr[a+1][3] > arr[a][3])) {
          int[] temp = arr[a+1];
          arr[a+1] = arr[a];
          arr[a] = temp;
        }
      }
    }

    // 순위 계산
    int rank = 1;
    for (int i = 0; i < arr.length; i++) {
      if (i > 0 && (arr[i][1] != arr[i - 1][1] || arr[i][2] != arr[i - 1][2] || arr[i][3] != arr[i - 1][3])) {
        rank = i + 1;
      }
      if (arr[i][0] == target) {
        System.out.println(rank);
        break;
      }
    }
  }

}
