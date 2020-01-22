package com.dsa.array.nge;

import java.util.Stack;

/**
 * @author Amit Mishra
 * @Date 16 jan 2020
 * The type Nge arrays.
 */
public class NGEArrays {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    //nextNGE();
    nextNGEUsingStack();
  }

  //here time complexity is o(n2)
  private static void nextNGE() {
    //int [] arr = new int[]{11, 13, 21, 3, 42, 5};
    int [] arr = new int[]{4, 5, 2, 25, 7, 32, 8, 6};

    for (int i = 0; i < arr.length; i++) {
      int currentElement = arr[i];
      int nextBig = -1;
      for(int j=i;j<arr.length;j++){
        if(currentElement < arr[j]){
          nextBig = arr[j];
          break;
        }
      }
      System.out.println(currentElement +"-"+nextBig);
    }
  }

  //time complexity is o(n)
  private static void nextNGEUsingStack() {
    int[] arr = new int[] {4, 5, 2, 25, 7, 32, 8, 6};
    Stack<Integer> s = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      int currentElement = arr[i];
      if (s.isEmpty()) {
        s.push(currentElement);
        continue;
      }
      while (!s.isEmpty() && s.peek() < currentElement) {
        System.out.println(s.pop() + "-" + currentElement);
      }
        s.push(currentElement);
    }
    while (!s.isEmpty())
      System.out.println(s.pop() + "-" + -1);
  }
}
