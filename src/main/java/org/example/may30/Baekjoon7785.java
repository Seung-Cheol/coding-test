package org.example.may30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon7785 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(bf.readLine());
    //이름을 담을 빈 배열을 생성합니다
    List<String> list = new ArrayList<>();
    //상태 확인을 위한 map을 생성합니다
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i<len; i++) {
      String[] str = bf.readLine().split(" ");
      //만약 들어갔을 경우 1을 추가합니다
      if(str[1].equals("enter"))
        map.put(str[0], map.getOrDefault(str[0] , 0) + 1);
      //만약 나왔을 경우 0으로 리셋합니다
      if(str[1].equals("leave"))
        map.put(str[0], 0);
    }

    for(String s : map.keySet()) {
      //enter가 leave 없이 1 이상 됐을 때만 리스트에 담습니다
      if(map.get(s)>=1) {
        list.add(s);
      }
    }

    list.sort((o1, o2) -> {
      //역정렬합니다
      return o2.compareTo(o1);
    });

    for(String s : list) {
      System.out.println(s);
    }
  }

}
