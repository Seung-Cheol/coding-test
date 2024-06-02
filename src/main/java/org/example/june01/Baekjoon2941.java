package org.example.june01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2941 {

  public static void main(String[] args) throws Exception {
    /*
    크로아티아 알파벳은 최대 3자리이므로 반복문을 돌려서 stack을 쌓을 떄
    3자리가 넘어가면 앞에 하나씩 지운다

    2자리 이상일 때 크로아티아문자열이 포함되는지 검색하고
    포함된다면 문자열을 모두 지운다

    카운트를 +1하고 크로아티아 문자가 아닌 나머지는 별표로 대체한다.
     */
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String strArr = bf.readLine();
    int count = 0;
    String[] list = new String[]{
      "c=","c-","dz=","d-","lj","nj","s=","z="
    };
    String strStack= "";
    for(int i = 0; i<strArr.length(); i++) {
      strStack += strArr.charAt(i);
        for(int a = 0; a<list.length; a++) {
          if(strStack.endsWith(list[a])) {
            count += 1;
            strStack = "*".repeat(strStack.length() - list[a].length());
          }
        }
    }
    System.out.print(count + strStack.length());
  }
}
