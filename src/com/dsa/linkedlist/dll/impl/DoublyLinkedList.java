package com.dsa.linkedlist.dll.impl;

import com.dsa.linkedlist.Node;

public class DoublyLinkedList<E> {

  private Node head;

  private Node tail;

  private int size;

  public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public boolean isEmpty(){
    return this.head == null;
  }

  public boolean add(E obj){
    if(isEmpty()){
      return firstElementAddition(obj);
    }
    Node newNode = new Node(obj,null,this.tail);
    this.tail.setNextNode(newNode);
    this.tail = newNode;
    ++size;
    return true;
  }

  private boolean firstElementAddition(E obj) {
    Node newNode = new Node(obj,null,null);
    this.head = newNode;
    this.tail = newNode;
    ++size;
    return true;
  }

  public boolean addLast(E obj){
    return add(obj);
  }

  public boolean addFirst(E obj){
    if(isEmpty()){
      return firstElementAddition(obj);
    }
    Node newNode = new Node(obj, head, null);
    this.head.setPrevNode(newNode);
    this.head = newNode;
    ++size;
    return true;
  }

  public boolean addAtIndex(E obj, int index){
    if(index > size){
      System.out.println("Invalid location, List is empty");
      return false;
    }
    if(isEmpty()){
      return firstElementAddition(obj);
    }

    Node tmpNode = this.head;
    int location = 0;
    while (location < index - 1 ){
      tmpNode = tmpNode.getNextNode();
      location++;
    }
    Node newNode = new Node(obj,null);
    return true;
  }

  public void traverse() {
    if (isEmpty()) {
      System.out.println("List is empty");
      return;
    }
    Node tmpNode = this.head;
    while (null != tmpNode && null != tmpNode.getData()) {
      System.out.println(tmpNode.getData());
      tmpNode = tmpNode.getNextNode();
    }

  }

  public void traverseTail() {
    if (isEmpty()) {
      System.out.println("List is empty");
      return;
    }
    Node tmpNode = this.tail;
    while (null != tmpNode && null != tmpNode.getData()) {
      System.out.println(tmpNode.getData());
      tmpNode = tmpNode.getPrevNode();
    }

  }
}
