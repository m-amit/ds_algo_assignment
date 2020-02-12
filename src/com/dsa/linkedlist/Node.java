package com.dsa.linkedlist;

/**
 * The type Node.
 *
 * @param <E>  the type parameter
 */
public class Node<E> {
  E data;
  Node<E> nextNode;
  Node<E> prevNode;

  /**
   * Instantiates a new Node.
   * this we can use for doubly linkedList or even for singly if we pass prev Node null
   *
   * @param data the data
   * @param nextNode the next node
   * @param prevNode the prev node
   */
  public Node(E data, Node<E> nextNode, Node<E> prevNode) {
    this.data = data;
    this.nextNode = nextNode;
    this.prevNode = prevNode;
  }

  /**
   * Instantiates a new Node.
   * this node specially created for singlyLinked list implementation
   *   here prevNode is by default null
   *
   * @param data the data
   * @param nextNode the next node
   */

  public Node(E data, Node<E> nextNode) {
    this.data = data;
    this.nextNode = nextNode;
    this.prevNode = null;
  }

  public Node<E> getNextNode(){
    return this.nextNode;
  }

  public void setNextNode(Node<E> newNode){
    this.nextNode = newNode;
  }

  public E getData(){
    return this.data;
  }

  public Node<E> getPrevNode(){
    return this.prevNode;
  }

  public void setPrevNode(Node<E> prevNode){
    this.prevNode = prevNode;
  }

}
