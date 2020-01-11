package com.dsa.bitwise.operator;

/**
 * @author Amit Mishra
 * @date 09-jan-2020
 */
public class SwapThreeVariableWithoutTemp {

  public static void main(String[] args) {
    swapThreeVariableWithoutTempUsingXOR(10,20,-30);
    swapThreeVariableWithoutTempUsingAddition(-10,20,30);
  }

  /**
   * Swap three variablewithout temp.
   * using XOR operation
   *
   * @param a the a
   * @param b the b
   * @param c the c
   */
  static void swapThreeVariableWithoutTempUsingXOR(int a, int b, int c) {
    a = a ^ b ^ c;
    b = a ^ b ^ c;
    c = a ^ b ^ c;
    a = a ^ b ^ c;
    System.out.println(a + " " + b + " " + c);
  }

  /**
   * Swap three variable without temp using addition.
   *
   * @param a the a
   * @param b the b
   * @param c the c
   */
  static void swapThreeVariableWithoutTempUsingAddition(int a, int b, int c) {
    a = a + b + c;
    b = a - (b + c);
    c = a - (b + c);
    a = a - (b + c);
    System.out.println(a + " " + b + " " + c);
  }
}
