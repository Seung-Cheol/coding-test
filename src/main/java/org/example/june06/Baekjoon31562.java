package org.example.june06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
성능 : 메모리 17556kb 시간 216ms
 */
public class Baekjoon31562 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Map<String, String> songMap = new HashMap<>();
    for(int i = 0; i<arr[0]; i++) {
      //스플릿으로 자릅니다
      String[] temp = bf.readLine().split(" ");
      //음 3개를 저장합니다
      String tone = temp[2] + " " + temp[3] + " " + temp[4];
      //만약 음 3개가 이미 있었다면 ?를 없다면 곡 이름을 저장합니다
      songMap.put(tone,songMap.containsKey(tone) ? "?" : temp[1]);
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<arr[1]; i++) {
      String temp = bf.readLine();
      //만약 get을 못해온다면 !를 출력합니다
      sb.append(songMap.getOrDefault(temp, "!")).append("\n");
    }
    System.out.print(sb);
  }

}
