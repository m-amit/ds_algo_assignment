package com.dsa.infix.to.postfix;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * The type Infix to post fix conversion.
 * here will follow operator-precedence-and-associativity rule
 * () is having highest precedence which is 0
 * multiply (*) and division(/) is having lower than () which is 1
 * plus (+) and (-) is having lower precedence than multiply and division which 2
 *
 * https://introcs.cs.princeton.edu/java/11precedence/ for ref
 */
public class InfixToPostFixConversion {

  public static final List OPERATORS = Arrays.asList('(', ')', '+', '-', '*', '/');
  public static final List LOW = Arrays.asList('+', '-');
  public static final List HIGH = Arrays.asList('*', '/');

  private static Stack<Character> operatorStack = new Stack<>();
  static StringBuilder result= new StringBuilder();

  public static void main(String[] args) {
    String expression = "A+B*(C/(E-F))";
    result.append("POST fix of " + expression + " is ");
    char[] exp = expression.replaceAll(" ", "").toCharArray();
    for (char ch : exp) {
      if (OPERATORS.contains(ch)) {
        if (operatorStack.isEmpty()) {
          operatorStack.push(ch);
          continue;
        }
        isOfHigherPrecedence(ch, operatorStack.peek());
      } else {
        result.append(ch);
      }
    }
    popAll();
    System.out.println(result.toString());
  }

  // a is incoming and b is current
  static void isOfHigherPrecedence(char incoming, char current) {
    //if incoming contains highest and current is lowest simply push it
    if (incoming == '(' || current == '(' || (HIGH.contains(incoming) && LOW.contains(current))) {
      operatorStack.push(incoming);
      return;
    } else if ((HIGH.contains(incoming) && HIGH.contains(current)) || (LOW.contains(incoming) && LOW.contains(current))) {
      //if both incoming and current are with same precedence will first pop
      // the current and push the incoming comparing with 2nd peek
      result.append(operatorStack.pop());
      if (operatorStack.isEmpty()) {
        operatorStack.push(incoming);
        return;
      }
      isOfHigherPrecedence(incoming, operatorStack.peek());
    } else if (HIGH.contains(current) && LOW.contains(incoming)) {
      //if current is highest simply pop print and then push
      result.append(operatorStack.pop());
      if (operatorStack.isEmpty()) {
        return;
      }
      isOfHigherPrecedence(incoming, operatorStack.peek());
    } else if (incoming == ')') {
      popUntilClosingBracesFound();
      return;
    }
  }

  static void popUntilClosingBracesFound() {
    if (operatorStack.isEmpty())
      return;
    if (operatorStack.peek() == '(') {
      operatorStack.pop();
      return;
    }
    result.append(operatorStack.pop());
    popUntilClosingBracesFound();
  }

  static void popAll() {
    if (operatorStack.isEmpty()) {
      return;
    }
    result.append(operatorStack.pop());
    popAll();
  }

}
