package org.example.may29;

import java.util.Scanner;

public class Baekjoon1924 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] str = scanner.nextLine().split(" ");
    System.out.println(weekDay(date(Integer.parseInt(str[0]), Integer.parseInt(str[1]))));
  }

  private static int date(int x, int y) {
    int date = y;
    for(int i = 1; i<x; i++) {
      switch(i) {
        case 1 :
          date += 31;
          break;
        case 2 :
          date += 28;
          break;
        case 3 :
          date += 31;
          break;
        case 4 :
          date += 30;
          break;
        case 5 :
          date += 31;
          break;
        case 6 :
          date += 30;
          break;
        case 7 :
          date += 31;
          break;
        case 8 :
          date += 31;
          break;
        case 9 :
          date += 30;
          break;
        case 10 :
          date += 31;
          break;
        case 11 :
          date += 30;
          break;
        case 12 :
          date += 31;
          break;
      }
    }
    return date;
  }

  private static String weekDay(int date) {
    String weekDay = null;
    switch (date%7) {
      case 1 :
        weekDay = "MON";
        break;
      case 2 :
        weekDay = "TUE";
        break;
      case 3 :
        weekDay = "WED";
        break;
      case 4 :
        weekDay = "THU";
        break;
      case 5 :
        weekDay = "FRI";
        break;
      case 6 :
        weekDay = "SAT";
        break;
      case 0 :
        weekDay = "SUN";
        break;
    }
    return weekDay;
  }

}
