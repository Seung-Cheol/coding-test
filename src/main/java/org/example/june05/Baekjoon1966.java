package org.example.june05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Baekjoon1966 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(bf.readLine());
    for(int i = 0; i<number; i++) {
      int pointer = Integer.parseInt(bf.readLine().split(" ")[1]);
      Deque<Integer> printList = Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedList::new));
      Deque<Integer> index = new LinkedList<>();
      for(int a = 0; a<printList.size(); a++) {
        index.add(a);
      }
      int count = 0;
      while(true) {
        int firstValue = printList.getFirst();
        int firstPointer = index.getFirst();
        for (int k : printList) {
          if (k > firstValue) {
            printList.addLast(firstValue);
            printList.removeFirst();
            firstValue = printList.getFirst();
            index.addLast(index.getFirst());
            index.removeFirst();
            break;
          }
        }
        if(firstPointer==index.getFirst()) {
          count++;
          printList.removeFirst();
          index.removeFirst();
          if(firstPointer==pointer) {
            System.out.println(count);
            break;
          }
        }
      }
    }
  }
}
