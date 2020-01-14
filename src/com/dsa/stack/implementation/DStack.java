package com.dsa.stack.implementation;

import java.util.Arrays;

/**
 * @author Amit Mishra
 * @date 14 jan 2020
 * The type Dynamic stack.
 *
 * @param <E>  the type parameter
 */
public class DStack<E> {

  private Object[] elementData;

  private Integer top = -1;

  /**
   * Instantiates a new D stack.
   */
  public DStack() {
    this.elementData = new Object[10];
    //
  }

  /**
   * Push e.
   *
   * @param obj the obj
   * @return the e
   */
  public E push(E obj) {
    checkCapacity();
    elementData[++top] = obj;
    return obj;
  }

  /**
   * Pop e.
   *
   * @return the e
   */
  public synchronized E pop() {
    E obj = peek();
    elementData[top] = null;
    top--;
    shrinkCapacity();
    return obj;
  }

  /**
   * Peek e.
   *
   * @return the e
   */
  public E peek() {
    E obj = (E) elementData[top];
    return obj;
  }

  private void shrinkCapacity(){
    if(elementData.length > top +10){
      elementData = Arrays.copyOf(elementData, top +10);
    }
  }

  private void checkCapacity() {
    if (elementData.length == top + 3) {
      elementData = Arrays.copyOf(elementData, elementData.length + 10);
    }

  }
}
