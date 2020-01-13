package com.dsa.bitwise.operator;

public class FlipAllBitsOfInteger {

  public static void main(String[] args) {
    Integer num = 16;
    num = flipAllBitsOfANum(num, Integer.toBinaryString(num).length());
    System.out.println(num);
  }

  static int flipAllBitsOfANum(Integer num, Integer bitCount) {

    return num ^ getAllOnes(bitCount);
  }

  static int getAllOnes(Integer count) {
    int num = 0;
    for (int i = 0; i < count; i++) {
      num = num | 1 << i;
    }
    return num;
  }

}
