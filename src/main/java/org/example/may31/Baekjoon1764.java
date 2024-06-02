package org.example.may31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Baekjoon1764 {

  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] total = bf.readLine().split(" ");
    int noSoundNum = Integer.parseInt(total[0]);
    int noLookNum = Integer.parseInt(total[1]);
    Set<String> NotSound = new HashSet<>();
    for (int i = 0; i < noSoundNum; i++) {
      NotSound.add(bf.readLine());
    }
    Set<String> result = new HashSet<>();
    for (int i = 0; i < noLookNum; i++) {
      String temp = bf.readLine();
      if(NotSound.contains(temp)) {
        result.add(temp);
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(result.size()).append("\n");
    List<String> list  = result.stream().sorted().collect(Collectors.toList());
    for(String rs : list) {
      sb.append(rs).append("\n");
    }
    System.out.print(sb);
  }

}
