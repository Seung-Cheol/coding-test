package org.example.may29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon25206 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Float> point = new ArrayList<>();
    List<Float> grade = new ArrayList<>();
    for(int i = 0; i<20; i++) {
      String[] str = scanner.nextLine().split(" ");
      if(str[2].equals("P")) {
        continue;
      }
      switch(str[2]) {
        case "A+" :
          grade.add(4.5f);
          break;
        case "A0" :
          grade.add(4.0f);
          break;
        case "B+" :
          grade.add(3.5f);
          break;
        case "B0" :
          grade.add(3.0f);
          break;
        case "C+" :
          grade.add(2.5f);
          break;
        case "C0" :
          grade.add(2.0f);
          break;
        case "D+" :
          grade.add(1.5f);
          break;
        case "D0" :
          grade.add(1.0f);
          break;
        case "F":
          grade.add(0.0f);
          break;
      }
      point.add(Float.parseFloat(str[1]));
    }
    float totalGrade = 0;
    float totalPoint = 0;
    int size = grade.size();
    for(int i = 0; i<size; i++) {
      totalGrade += point.get(i)*grade.get(i);
    }
    if(totalGrade==0.0f) {
      System.out.println(0.0f);
      return;
    }

    for(float i : point) {
      totalPoint += i;
    }
    System.out.println(totalGrade / size / (totalPoint/size));
  }

}
