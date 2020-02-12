package com.dsa.linkedlist.ssl.impl;

import com.dsa.linkedlist.Node;

public class SingleCircularLinkedList<E> {

  private Node head;
  private Node tail;
  private int size;

  public SingleCircularLinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public boolean isEmpty(){
    return null == head;
  }

  public boolean add(E obj){
    if(isEmpty()){
      return firstAdd(obj);
    }
    Node newNode = new Node(obj, head);
    tail.setNextNode(newNode);
    this.tail = newNode;
    ++size;
    return true;
  }

  private boolean firstAdd(E obj) {
    Node newNode = new Node(obj, null);
    this.head = newNode;
    this.tail = newNode;
    tail.setNextNode(head);
    ++size;
    return true;
  }

  public boolean addLast(E obj){
    return add(obj);
  }

  public boolean addFirst(E obj){
    if(isEmpty()){
      return firstAdd(obj);
    }
    Node newNode = new Node(obj, null);
    newNode.setNextNode(this.head);
    this.head = newNode;
    this.tail.setNextNode(head);
    ++size;
    return true;
  }

  public boolean addAtLocation(E obj, int location){
    if(location > size){
      System.out.println("LinkedList is empty, location is invalid");
    }
    Node tmpNode = head;
    int index = 0;
    while (index < location - 1) {
      tmpNode = tmpNode.getNextNode();
      index++;
    }
    Node newNode = new Node(obj, tmpNode.getNextNode());
    tmpNode.setNextNode(newNode);
    ++size;
    return true;
  }

  

  public void traverse(){
    Node tmpNode = head;
    int index = 0;
    while (index < size){
      System.out.println(tmpNode.getData());
      tmpNode = tmpNode.getNextNode();
      index++;
    }
  }

  public void traverseCircular(){
    Node tmpNode = head;
    while (null != tmpNode){
      System.out.println(tmpNode.getData());
      tmpNode = tmpNode.getNextNode();
    }
  }
}
