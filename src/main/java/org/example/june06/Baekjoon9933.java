package org.example.june06;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
성능 : 메모리 16156kb 시간 124ms
 */
public class Baekjoon9933 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    Map<String, String> nameMap = new HashMap<>();
    for(int i = 0 ; i<number; i++) {
      String temp = bf.readLine();
      //맵에 리버스된 단어와 원래 단어를 키 밸류로 저장합니다
      nameMap.put(new StringBuffer(temp).reverse().toString(),temp);
      //만약 현재 단어가 키에 포함됐을 경우 ( 리버스된 키와 현재 밸류가 같을 때 )
      if(nameMap.containsKey(temp)) {
        System.out.print(temp.length() + " " + temp.charAt(temp.length() / 2));
        break;
      }
    }

  }
}
