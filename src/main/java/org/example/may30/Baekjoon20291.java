package org.example.may30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon20291 {

  public class Main {

    public static void main(String[] args) throws Exception {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int len = Integer.parseInt(bf.readLine());
      Map<String, Integer> map = new HashMap<>();
      for (int i = 0; i < len; i++) {
        //.으로 스플릿해서 자릅니다
        String suffix = bf.readLine().split("\\.")[1];
        //map에 객체와 갯수를 저장합니다
        map.put(suffix, map.getOrDefault(suffix, 0) + 1);
      }

      //set 갯수에 맞게 list를 만듭니다
      String[] suffixList = map.keySet().toArray(new String[0]);

      //Comparator 펑셔널 인터페이스를 구현하여 정렬합니다
      Arrays.sort(suffixList, (o1, o2) -> o1.compareTo(o2));
      for(String s :suffixList) {
        System.out.println(s + " " + map.get(s));
      }

    }

  }

}
