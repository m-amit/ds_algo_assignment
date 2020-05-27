package com.dsa.linkedlist.ssl.impl;

import com.dsa.linkedlist.Node;

public class SingleLinkedList<E> {

  Node head;
  Node tail;
  int size;

  public SingleLinkedList() {
    this.head = null;
    this.tail = null;
    size = 0;
  }

  public Node getHead(){
    return head;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public boolean add(E obj) {
    Node<E> newNode = new Node<>(obj, null);
    if (isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
      ++size;
      return true;
    }
    tail.setNextNode(newNode);
    this.tail = newNode;
    ++size;
    return true;
  }

  public boolean addFirst(E obj) {
    Node<E> newNode = new Node<>(obj, null);
    if (isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
      ++size;
      return true;
    }
    newNode.setNextNode(head);
    this.head = newNode;
    ++size;
    return true;
  }

  public boolean addLast(E obj) {
    return add(obj);
  }

  public boolean addATLocation(E obj, int location) {
    if (location > size) {
      System.out.println("location does not exist try inseting at first or last");
      return false;
    }
    Node<E> newNode = new Node<>(obj, null);
    if (isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
      ++size;
      return true;
    }
    Node tmpNode = head;
    int index = 0;
    while (index < location -1) {
      tmpNode = tmpNode.getNextNode();
      index++;
    }
    newNode.setNextNode(tmpNode.getNextNode());
    tmpNode.setNextNode(newNode);
    ++size;
    return true;
  }

  public boolean reverse(){
    reverse(head);
    return true;
  }

  private Node reverse(Node head) {
    if(head == null) {
      return head;
    }

    // last node or only one node
    if(head.getNextNode() == null) {
      return head;
    }

    Node newHeadNode = reverse(head.getNextNode());

    // change references for middle chain
    head.getNextNode().setNextNode(head);
    head.setNextNode(null);

    // send back new head node in every recursion
    return newHeadNode;
  }

  public void traverseSLL() {
    if (!isEmpty()) {
      Node tmpNode = head;
      while (null != tmpNode && tmpNode.getData() != null) {
        System.out.println(tmpNode.getData());
        tmpNode = tmpNode.getNextNode();
      }
    }
  }

  public boolean deleteSLL(){
    this.head = null;
    this.tail = null;
    this.size = 0;
    return true;
  }

  public boolean deleteLast(){
    if(isEmpty()){
      System.out.println("Single LinkedList is already empty try adding some first :)");
      return false;
    }
    Node tmpNode = head;
    while (tmpNode.getNextNode().getNextNode() != null){
      tmpNode = tmpNode.getNextNode();
    }
    tmpNode.setNextNode(null);
    this.tail = tmpNode;
    --size;
    return true;
  }

  public boolean delete(){
    return deleteLast();
  }

  public boolean deleteFirst(){
    if(isEmpty()){
      System.out.println("Single LinkedList is already empty try adding some first :)");
      return false;
    }

    this.head = head.getNextNode();
    --size;
    return true;
  }

  public boolean deleteIndex(int location){
    if(location > size){
      System.out.println("location does not exist first try inseting :)");
      return false;
    }
    Node tmpNode = head;
    int index = 0;
    while(index < location -1){
      tmpNode = tmpNode.getNextNode();
      index++;
    }
    tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
    return true;
  }

  public E getNodeValueByIndex(int position) {
    if (position > size) {
      System.out.println("location does not exist first try inseting :)");
      return null;
    }
    Node tmpNode = head;
    int index = 0;
    while (index < position) {
      tmpNode = tmpNode.getNextNode();
      index++;
    }
    return (E) tmpNode.getData();
  }

  public boolean isValuePresent(E val){
    if(isEmpty()){
      System.out.println("Linked list is empty first try to add");
      return false;
    }
    boolean found = false;
    Node tmpNode = head;
    for (int i = 0; i < size; i++) {
      if(tmpNode.getData().equals(val)){
        found = true;
        break;
      }
      tmpNode = tmpNode.getNextNode();
    }
    return found;
  }

  public boolean reverseInChunks(int chunk) {
    reverseChunk(head, chunk);
    return true;
  }

  private Node reverseChunk(Node node, int chunk) {
    if(node == null || node.getNextNode() == null){
      return node;
    }

    return null;

  }

}
