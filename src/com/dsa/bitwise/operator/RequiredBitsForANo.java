package com.dsa.bitwise.operator;

public class RequiredBitsForANo {

  public static void main(String[] args) {
    printRequiredBits(16);
  }

  static void printRequiredBits(Integer number){
    int count = 0;
    while(number>0){
      ++count;
      number &= number-1;
    }
    System.out.println(count);
  }
}
