package com.dsa.stack.stock.span;

import java.util.Stack;

/**
 * @author Amit Mishra
 * @date 21-jan 2020
 */
public class StockSpanner {

  public static void main(String[] args) {
    Integer[] prices = {100,80,60,70,60,75,85};
    Stack<Integer> span = new Stack<>();
    for(int i=0;i<prices.length;i++){
      while (!span.isEmpty() && prices[span.peek()]<= prices[i]){
        span.pop();
      }
      int result = span.isEmpty() ? (i+1) : i-span.peek();
      span.push(i);
      System.out.print(result +"");
    }
  }

  /*static int next(int price){

  }*/



  /*static int next(int price) {
    int result = 1;
    if (stack.isEmpty()) {
      stack.push(price);
      return result;
    }
    result = cal(price);
    stack.push(price);
    return result;
  }

  static int cal(int price){
    int result =1;
    if(stack.isEmpty())
      return result;
    int current = stack.pop();
    if (current <= price) {
      //if current is found less than price then will do this
      // recursively till we reach a point where current is not less than price
      result += cal(price);
      stack.push(current);
      return result;
    } else {
      stack.push(current);
    }
    return result;
  }*/
}
