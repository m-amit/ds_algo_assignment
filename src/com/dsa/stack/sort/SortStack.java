package com.dsa.stack.sort;

import java.util.Stack;

public class SortStack {

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(17);
    s.push(2);
    s.push(9);
    s.push(4);
    popAllFromStack(s);
    System.out.println(s);
  }

  static void popAllFromStack(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int sElement = s.pop();
    popAllFromStack(s);
    sortPopedStackElements(s, sElement);
  }

  static void sortPopedStackElements(Stack<Integer> s, Integer element) {
    if (s.isEmpty()) {
      s.push(element);
      return;
    }
    if (element < s.peek()) {
      Integer bigVal = s.pop();
      sortPopedStackElements(s, element);
      s.push(bigVal);
    } else {
      s.push(element);
    }

  }
}
