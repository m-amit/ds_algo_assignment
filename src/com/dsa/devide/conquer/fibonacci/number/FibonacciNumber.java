package com.dsa.devide.conquer.fibonacci.number;

public class FibonacciNumber {
  public static void main(String[] args) {
    System.out.println(printFibonacciNumber(9));
  }

  public static int printFibonacciNumber(int n){
    if(n <= 1){
      return n;
    }
    return printFibonacciNumber(n -1) + printFibonacciNumber(n - 2);
  }
}
