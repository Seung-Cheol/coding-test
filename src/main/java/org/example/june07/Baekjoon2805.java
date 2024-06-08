package org.example.june07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
성능 : 메모리 137896KB 시간 592ms
 */
public class Baekjoon2805 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] val = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] forest = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int target = val[1];
    int max = Arrays.stream(forest).max().getAsInt();
    int min = 0;

    while (min <= max) {
      int mid = (max + min) / 2;
      long sum = 0;
      for (int tree : forest) {
        if (tree > mid) {
          sum += tree - mid;
        }
      }
      //sum 과 target이 같으면 mid를 출력합니다
      if (sum == target) {
        System.out.print(mid);
        return;
        //target 값이 더 큰 경우 max값을 낮춰서 자르는 크기를 늘려야 합니다
      } else if (sum < target) {
        max = mid - 1;
        //그렇지 않은 경우 자르는 크기를 줄여야 합니다
      } else {
        min = mid + 1;
      }
    }
    //루프문을 빠져나왔을 경우 정확한 값이 없습니다.
    //min이 더 커졌을 경우 target 값에 못미치므로 max를 출력합니다
    System.out.print(max);
  }
}