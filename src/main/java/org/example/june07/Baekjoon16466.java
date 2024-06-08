package org.example.june07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
성능 : 114364kb 616ms
 */
public class Baekjoon16466 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    int[] line = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(line);
    for(int i = 0; i<line.length; i++) {
      if(line[i]!=i+1) {
        //0번째에는 1 1번째에는 2여야 함. 아니라면 중간에 누락된 게 있다는 소리임 그래서 누락됐으면 그 값을 출력함
        System.out.print(i+1);
        return;
      }
    }
    //순서대로 입력된게 맞으면 길이 + 1만큼 출력합니다
    System.out.print(line.length+1);
  }
}
