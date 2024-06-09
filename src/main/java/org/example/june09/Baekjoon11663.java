package org.example.june09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Baekjoon11663 {

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] points = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(points);

    for(int i = 0; i<arr[1]; i++) {
      int[] temp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int min = 0;
      int max = points.length - 1;
      int firstIndex = 0;
      int lastIndex = 0;
      while(min<=max) {
        int mid = (min+max) / 2;
        if(points[mid] > temp[1]) {
          max = mid - 1;
        } else  {
          min = mid + 1;
        }
      }
      lastIndex = max;

      min = 0;
      max = points.length - 1;
      while(min<=max) {
        int mid = (min+max) / 2;
        if(points[mid] < temp[0]) {
          min = mid+1;
        } else {
          max = mid-1;
        }
      }
      firstIndex = min;

      System.out.println(lastIndex - firstIndex + 1);
    }

  }

}
