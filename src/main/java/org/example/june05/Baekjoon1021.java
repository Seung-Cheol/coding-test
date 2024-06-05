package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon1021 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] inputValue = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] inputValue2 = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    LinkedList<Integer> dq = new LinkedList<>();
    int count = 0;
    for(int i = 1; i<=inputValue[0]; i++) {
      dq.add(i);
    }
    for(int val : inputValue2) {
      int size = dq.size();
      int target = dq.indexOf(val);
      int middleValue;
      if(size %2 == 0) {
        middleValue = size / 2 -1;
      } else {
        middleValue = size / 2;
      }
      if(target <= middleValue) {
        for(int i = 0; i<target; i++) {
          dq.offerLast(dq.pollFirst());
          count++;
        }
      } else {
        for(int i = 0; i<size - target; i++) {
          dq.offerFirst(dq.pollLast());
          count++;
        }
      }
      dq.removeFirst();
    }
    System.out.print(count);
  }
}
