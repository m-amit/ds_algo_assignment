package com.dsa.string.to.integer;

public class StringToInteger {

  public static void main(String[] args) {
    //valid input
    System.out.println(convertIntegerToString("1234"));
    //valid negaive inpur
    System.out.println(convertIntegerToString("-1234"));
    //invalid input
    System.out.println(convertIntegerToString("-123a4"));
  }

  static int convertIntegerToString(String s) {
    Integer result = 0;
    if (null == s || s.equals(""))
      return 0;
    char[] chars = s.trim().toCharArray();
    int i = 0;
    int length = chars.length;
    boolean isNegative = false;
    if (chars[0] == '-') {
      i = 1;
      isNegative = true;
    }
    while (i < length) {
      if (chars[i] >= '0' && chars[i] <= '9') {
        int digit = chars[i] - '0';
        result = result * 10 + digit;
        i++;
      } else {
        System.out.println("invalid string");
        return 0;
      }
    }
    if (isNegative) {
      result = -result;
    }
    return result;
  }
}
