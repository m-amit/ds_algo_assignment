package com.dsa.bitwise.operator;

public class BitwiseExamples {

  public static void main(String[] args) {
    System.out.println("check if kth bit is set :: "+checkIfKthBitIsSet(40,4));
    System.out.println("set kth bit :: "+settingKthBit(40,8));
  }

  static boolean checkIfKthBitIsSet(int no, int k){
    int result = no & (1 << (k - 1));
    return result != 0;
  }

  static int settingKthBit(int no, int k) {
    return no | (1 << (k - 1));
  }
}
