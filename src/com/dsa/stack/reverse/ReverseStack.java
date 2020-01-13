package com.dsa.stack.reverse;

import java.util.Stack;

public class ReverseStack {

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    reverse(s);
    System.out.println(s);
  }

  static void reverse(Stack s) {
    if (s.isEmpty())
      return;
    Integer num = (Integer) s.pop();
    reverse(s);
    reverseStack(s, num);

  }

  static void reverseStack(Stack s, Integer a) {
    if (s.isEmpty()) {
      s.push(a);
      return;
    }
    Integer mber = (Integer) s.pop();
    reverseStack(s, a);
    s.push(mber);

  }
}
