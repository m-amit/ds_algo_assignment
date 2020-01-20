package com.dsa.infix.to.postfix;

import java.util.Stack;

public class ReversePolishNotation {

  static final String OPERATORS = "+-*/";
  public static void main(String[] args) {
    String[] notation =  new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    System.out.println(evalRPN(notation));

  }
  public static int evalRPN(String[] tokens) {
    Stack<Integer> result = new Stack<>();
    for(String t : tokens){
      if(!OPERATORS.contains(t)){
        result.push(Integer.valueOf(t));
      }else{
        Integer a = result.pop();
        Integer b = result.pop();
        Integer op = OPERATORS.indexOf(t);
        switch (op){
          case 0:
            result.push(a+b);
            break;

          case 1 :
            result.push(b-a);
            break;

          case 2 :
            result.push(a*b);
            break;

          case 3 :
            result.push(b/a);
            break;
        }

      }
    }
    return result.pop();
  }
}
